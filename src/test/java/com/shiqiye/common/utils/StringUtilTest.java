package com.shiqiye.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src=" ";
		boolean hasLength = StringUtil.hasLength(src);
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		String src=" ";
		boolean hasText = StringUtil.hasText(src);
		System.out.println(hasText);
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(10);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() {
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}

}
