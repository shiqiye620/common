package com.shiqiye.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		Date randomDate = DateUtil.randomDate(c.getTime(), new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		System.out.println(simpleDateFormat.format(randomDate));
	}

}
