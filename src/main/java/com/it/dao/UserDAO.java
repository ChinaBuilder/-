package com.it.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.it.mapper.UserMapper;
import com.it.pojo.User;
import com.mysql.jdbc.PreparedStatement;

@Repository
public class UserDAO {
	@Autowired
	private UserMapper userMapper;

	/**
	 * �����ݿ������ѯ���е�Ա����Ϣ
	 */
	public List<User> findAll() {
		return userMapper.findAll();
	}

	/**
	 * ���ݴ����map���Ͳ�����ѯuser�б�
	 * 
	 * @param params
	 * @return
	 */
	public List<User> findUserListByParam(Map<String, Object> params) {
		return userMapper.findByParam(params);
	}

	public Long findtUserCount() {
		return userMapper.countAll();
	}

	public Long findUserCountByParam(Map<String, Object> params) {
		return userMapper.countByParam(params);
	}

	public void resetPassword(User user) {
		userMapper.updateUser(user);
	}

	public User findById(Integer id) {
		return userMapper.findById(id);
	}

	public void saveOne(User user) {
		userMapper.save(user);
	}

	/*
	 * ���Ի���jdbc����
	 * 
	 * @Autowired private DataSource dataSource;
	 * 
	 * private String insertSQL =
	 * "insert into t_user (id,	name,account,password,tel,enable,roleid) values (?,?,?,?,?,?,?)"
	 * ; private Connection conn; private PreparedStatement stat;
	 * 
	 * public void addOne() { try { conn = dataSource.getConnection(); stat =
	 * (PreparedStatement) conn.prepareStatement(insertSQL); //
	 * stat.setObject(1, 1); stat.setObject(2, "test"); stat.setObject(3,
	 * "accountname"); stat.setObject(4, "password"); stat.setObject(5,
	 * "123456"); stat.setObject(6, true); stat.setObject(7, 1); stat.execute();
	 * } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } finally { try { if (stat != null) { stat.close();
	 * } if (conn != null) { conn.close(); } } catch (SQLException e) {
	 * e.printStackTrace(); } } }
	 */

}
