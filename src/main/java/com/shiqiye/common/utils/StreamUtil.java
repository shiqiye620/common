package com.shiqiye.common.utils;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流处理
 * @author: ASUS
 * @date: 2020年3月1日 上午10:53:54
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	//读取inputStream放入集合
	public static List<String> read(InputStream InputStream) throws IOException{
		List<String> list=new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(InputStream));
		String line="";
		while((line=reader.readLine())!=null) {
			list.add(line);
		}	
		return list;
	}
	//根据文件的地址读取文件
	public static List<String> read(String filePath) throws IOException{
		FileInputStream InputStream = new FileInputStream(filePath);
		return read(InputStream);
	}
	//根据文件内容放入集合
	public static List<String> read(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		return read(fileInputStream);
	}
}
