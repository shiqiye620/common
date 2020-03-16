package com.shiqiye.common.utils;

import org.junit.Test;

public class StringUtilTest {
	@Test
	public void testUrl() {
		boolean b = StringUtil.isHttpUrl("https://www.baidu.com/");
		System.out.println(b);
	}
	
	@Test
	public void getValue() {
		String value = StringUtil.getValue("八维教育学院", 2);
		System.out.println(value);
	}
	
	@Test
	public void isNumber() {
		boolean email = StringUtil.isNumber("144528.2");
		System.out.println(email);
	}
	
	@Test
	public void isEmail() {
		boolean email = StringUtil.isEmail("1445284436@qq.com");
		System.out.println(email);
	}
	
	@Test
	public void isPhone() {
		boolean phone = StringUtil.isPhone("18360232702");
		System.out.println(phone);
	}
		
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
	
	@Test
	public void getPlaceholderValue() {
		String placeholderValue = StringUtil.getPlaceholderValue("", "");
		System.out.println(placeholderValue);
	}

}
