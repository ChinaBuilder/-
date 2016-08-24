package com.it.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyEncoding {
	/**
	 * 测试使用 Spring Security 里的 BCrypt
	 */
	@Test
	public void testEncoding() {
		String pas = MyEncoder.EncodMd5("123456", false);
		assertEquals(pas, "5538bba2bc93375a13580f821b1bfd60");
		// 5538bba2bc93375a13580f821b1bfd60
	}
}
