package com.it.mapper;

import java.util.List;
import java.util.Map;

import com.it.pojo.User;

public interface UserMapper {
	void deleteById(Integer id);

	List<User> findAll();

	Long countAll();

	Long countByParam(Map<String, Object> params);

	List<User> findByParam(Map<String, Object> params);

	User findById(Integer id);

	void updateUser(User user);

	void save(User user);
}
