package com.it.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.it.dao.UserDAO;
import com.it.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTestCase {

	@Autowired
	private UserDAO userDao;
	@Autowired
	private UserMapper userMapper;

	@Test
	public void TestDel() {
		userMapper.deleteById(1);
	}

}
