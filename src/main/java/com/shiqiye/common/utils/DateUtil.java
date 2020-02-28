package com.shiqiye.common.utils;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: ASUS
 * @date: 2020年2月28日 下午7:25:00
 */

import java.util.Date;

public class DateUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: TODO
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
