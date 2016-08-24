package com.it.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.authentication.PasswordEncoderParser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;
import com.it.dao.UserDAO;
import com.it.dto.DataTableResult;
import com.it.mapper.UserMapper;
import com.it.pojo.User;
import com.it.util.MyEncoder;
import com.it.util.Strings;

@Service
public class UserService<T> {
	@Autowired
	private UserDAO userdao;

	public boolean LoginCheck(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 查找所有用户
	 */
	public List<User> findAll() {
		return userdao.findAll();
	}

	/**
	 * 返回封装好的dataTableResult结果
	 * 
	 * @param draw
	 * @param start
	 * @param length
	 * @param keyword
	 * @return
	 */
	public DataTableResult<User> findByParam(String draw, String start, String length, String keyword) {
		keyword = Strings.toUTF8(keyword);
		Map<String, Object> params = Maps.newHashMap();
		params.put("keyword", keyword);
		params.put("start", start);
		params.put("length", length);

		List<User> userList = userdao.findUserListByParam(params);
		Long count = userdao.findtUserCount();
		Long filterCount = userdao.findUserCountByParam(params);

		return new DataTableResult<>(draw, userList, count, filterCount);
	}

	/**
	 * 根据id来重置密码，涉及多步操作需要事务支持
	 * 
	 * @param id
	 * @return
	 */
	@Transactional
	public boolean resetPassword(Integer id) {
		User user = userdao.findById(id);
		if (user.getId() != null) {
			String encodPassword = MyEncoder.EncodMd5(user.getPassword(), false);
			user.setPassword(encodPassword);
			userdao.resetPassword(user);
		}
		return true;
	}
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	public void insertOne(User user) {
		userdao.saveOne(user);
	}

}
