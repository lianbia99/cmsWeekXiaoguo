package com.lianbiao.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int r = RandomUtil.random(1, 3);
		System.out.println(r);
	}

	@Test
	public void testSubRandom() {
		int[] in = RandomUtil.subRandom(1, 10, 3);
		for (int i : in) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char randomchar = RandomUtil.randomCharacter();
		System.out.println(randomchar);
	}

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(5);
		System.out.println(str);
	}

}
