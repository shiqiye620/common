package com.shiqiye.common.utils;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: ASUS
 * @date: 2020年2月28日 下午7:25:00
 */

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回指定日期的月初
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	/**
	 * 
	 * @Title: getendtMonth 
	 * @Description: 制定月份的最后一天
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date  getendtMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
	}
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description:给出出生年月日求年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int year= c.get(Calendar.YEAR);
		int month= c.get(Calendar.MONTH);
		int day= c.get(Calendar.DAY_OF_MONTH);
		Calendar c1 = Calendar.getInstance();
		c1.setTime(new Date());
		int year1= c1.get(Calendar.YEAR);
		int month1= c1.get(Calendar.MONTH);
		int day1= c1.get(Calendar.DAY_OF_MONTH);
		int age=year1-year;
		if(month1<=month) {
			if(month1==month) {
				if(day1<day) {
					age--;
				}
			}else {
				age--;
			}
		}
		return age;
		
	}
	
	
	
	
	
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 返回参数中间的随机日期
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date min,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
		
		double d = Math.random();
		if(t1>t2)return null;
		long x=(long) (d*(t2-t1+1)+t1);
		
		
		return new Date(x);
	}
}
