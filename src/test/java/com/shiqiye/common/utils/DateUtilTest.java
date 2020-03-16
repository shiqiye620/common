package com.shiqiye.common.utils;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void randomDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		Date randomDate = DateUtil.randomDate(c.getTime(), new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		System.out.println(simpleDateFormat.format(randomDate));
	}
	
	@Test
	public void getInitMonth() {
		Date initMonth = DateUtil.getInitMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		System.out.println(simpleDateFormat.format(initMonth));
	}
	
	@Test
	public void getendtMonth() {
		Date date=DateUtil.getendtMonth(new Date());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		System.out.println(simpleDateFormat.format(date));
	}
	
	@Test
	public void getAgeByBirthday() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date parse = simpleDateFormat.parse("2001-03-07");
			System.out.println(parse);
			int ageByBirthday = DateUtil.getAgeByBirthday(parse);
			System.out.println(ageByBirthday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
