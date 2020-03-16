package com.shiqiye.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		int percent = NumberUtil.getPercent(5,10);
		System.out.println(percent);
	}

}
