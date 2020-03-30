package com.lianbiao.common;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean boo = StringUtil.hasText("aa");
		System.out.println(boo);
	}

	@Test
	public void testHasText() {
		boolean boo = StringUtil.hasText("a");
		System.out.println(boo);
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException{
		String str = StringUtil.randomChineseString(5);
		System.out.println(str);
	}

	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
