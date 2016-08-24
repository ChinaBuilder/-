package com.it.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class MyEncoder {
	/**
	 * 
	 * @param rawPass
	 *            原始密码（未加密）
	 * @param salt
	 *            加密所需要的盐
	 * @param Base64
	 *            是否使用base64
	 * @return 加密后的数据
	 */
	public static String EncodMd5(String rawPass, boolean Base64) {
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		encoder.setEncodeHashAsBase64(Base64);
		return encoder.encodePassword(rawPass, "long");
	}
}
