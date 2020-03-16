package com.shiqiye.common.utils;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: ������
 * @author: ASUS
 * @date: 2020��3��1�� ����10:53:54
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
	//��ȡinputStream���뼯��
	public static List<String> read(InputStream InputStream) throws IOException{
		List<String> list=new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(InputStream));
		String line="";
		while((line=reader.readLine())!=null) {
			list.add(line);
		}	
		return list;
	}
	//�����ļ��ĵ�ַ��ȡ�ļ�
	public static List<String> read(String filePath) throws IOException{
		FileInputStream InputStream = new FileInputStream(filePath);
		return read(InputStream);
	}
	//�����ļ����ݷ��뼯��
	public static List<String> read(File file) throws IOException{
		FileInputStream fileInputStream = new FileInputStream(file);
		return read(fileInputStream);
	}
}
