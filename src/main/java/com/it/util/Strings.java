package com.it.util;

import java.io.UnsupportedEncodingException;

/**
 * 
 * 
 * @author KAY
 *
 */
public class Strings {
	/**
	 * 
	 * 
	 * @param str
	 * @return
	 */
	public static String toUTF8(String str) {

		if (str == null || str.length() == 0) {
			return "";
		} else {
			try {
				return new String(str.getBytes("ISO8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(str + "���ַ���ת���쳣��");
			}
		}
	}

	/**
	 * 
	 * 
	 * @param str
	 *           
	 */
	public static String toPinYin(String str) {

		return null;
	}
}
