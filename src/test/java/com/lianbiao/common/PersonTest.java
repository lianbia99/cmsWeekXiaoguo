package com.lianbiao.common;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() throws UnsupportedEncodingException {
		for(int i=0;i<10000;i++) {
			Person p = new Person();
			//创建一个名字
			p.setName(StringUtil.generateChineseName());
			//创建年龄
			p.setAge(RandomUtil.random(1, 120));
			//创建about
			p.setAbout(StringUtil.randomChineseString(140));
			//创建日期
			p.setCreated(new Date());
			System.out.println(p);
		}
	}

}
