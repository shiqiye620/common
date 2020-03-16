package com.shiqiye.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Random;

/**
 * 
 * @ClassName: StringUtil 
 * @Description: �ַ���������
 * @author: ASUS
 * @date: 2020��2��27�� ����9:42:56
 */
public class StringUtil {
	public static boolean isHttpUrl(String param) {
		URL url;
		try {
			url=new URL(param);
			url.openStream();
			return true;//url合法
		} catch (Exception e) {
			System.out.println("连接打不开");
		}
		return false;
	}
	
	/**
	 * 
	 * @Title: getValue 
	 * @Description: ���ַ�����ȡ��λ����*����
	 * @param str
	 * @param start
	 * @return
	 * @return: String
	 */
	public static String getValue(String str,int start) {
		String s1=str.substring(2);
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			s2+="*";
		}
		return str.substring(0,2)+s2;
		
	}
	
	
	//�ж��ַ���
	public static boolean isPhone(String src) {
		String ref="^1[3|5|7|8]\\d{9}$";
		return src.matches(ref);
	}
	//�ж��Ƿ��������
	public static boolean isEmail(String src) {
		String reg="\\w+\\@\\w+\\.\\w+";
		return src.matches(reg);
	}
	//�ж��Ƿ���һ������
	public static boolean isNumber(String src) {
		String reg="(-)?[0-9]+(\\.[0-9]+)?";
		return src.matches(reg);
	}
	//����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
	public static boolean hasLength(String src){
		if(src!=null  && src.length()>0) {
			return true;
		}
		return false;
	
	}
	//����2���ж�Դ�ַ���	
	public static boolean hasText(String src){
		if(src!=null && src.trim().length()>0) {
			return true;
		}
		return false;
	
	}
	
	public static String randomChineseString() {
	     String str = null;
       int highPos, lowPos;
       Random random = new Random();
       highPos = (176 + Math.abs(random.nextInt(49)));//���룬0xA0��ͷ���ӵ�16����ʼ����0xB0=11*16=176,16~55һ�����֣�56~87��������
       random=new Random();
       lowPos = 161 + Math.abs(random.nextInt(95));//λ�룬0xA0��ͷ����Χ��1~94��
       byte[] bArr = new byte[2];
      
       bArr[0] = (new Integer(highPos)).byteValue();
       bArr[1] = (new Integer(lowPos)).byteValue();
       try {
           str = new String(bArr, "GB2312");   //��λ����ϳɺ���
       } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
       }
           return str;
   }
	
	
	//����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(int length){
		String str="";
		for (int i = 0; i <length; i++) {
			str+=randomChineseString();
		}
		return str;
	
	}
	//����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
	public static String generateChineseName(){
		String[] str= {"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʩ","��","��","��","��","��","��","κ","��","��","��","л","��","��","��","ˮ","�","��","��","��","��","��","��","��","��","��","³","Τ","��","��","��","��","��","��","��","��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʱ","��","Ƥ","��","��","��","��","��","Ԫ","��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ","��","��","ë","��","��","��","��","��","�","��","��","��","��","̸","��","é","��","��","��","��","��","��","ף","��","��","��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ","��","ͯ","��","��","÷","ʢ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","֧","��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ","��","��","��","��","��","��","��","��","��","��","��","��","ʯ","��","��","ť","��","��","��","��","��","��","½","��","��","��","��","�","��","��","�L","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɽ","��","��","��","�","��","ȫ","ۭ","��","��","��","��","��","��","��","��","��","��","��","б","��","��","��","��","��","��","��","ղ","��","��","Ҷ","��","˾","��","۬","��","��","��","ӡ","��","��","��","��","ۢ","��","��","��","��","��","��","׿","��","��","��","��","��","��","��","��","��","��","˫","��","ݷ","��","��","̷","��","��","��","��","��","��","��","Ƚ","��","۪","Ӻ","�S","�","ɣ","��","�","ţ","��","ͨ","��","��","��","��","ۣ","��","��","ũ","��","��","ׯ","��","��","��","��","��","Ľ","��","��","ϰ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","»","��","��","ŷ","�","��","��","ε","Խ","��","¡","ʦ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɳ","ؿ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȩ","��","��","��","��","��","��","��","��","��","��","۳","Ϳ","��","��","˧","��","��","��","��","��","��","��","Ĳ","��","٦","��","��","ī","��","��","��","��","��","��","١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����","����","����","�ʸ�","ξ��","����","�̨","��ұ","����","���","����","����","̫��","����","����","����","��ԯ","���","����","����","����","Ľ��","����","����","˾ͽ","˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����","����","���","����","����","����","�ذ�","�й�","�׸�","����","�θ�","����","����","����","����","��","��","����","΢��","����","����","����","����","�Ϲ�"};
		 //���� �����������ȡһ��
		  String name1 = str[RandomUtil.random(0, str.length-1)];
		  //����1-2���������
		  String name2 = randomChineseString(RandomUtil.random(1,2));
		  
		return name1 + name2;
	}
	
	public static String getPlaceholderValue(String src, String regex){
		String s=src;
		String value=s.charAt(s.length()-11)+""+s.charAt(s.length()-10)+""+s.charAt(s.length()-9)+""+s.charAt(s.length()-8)+""+s.charAt(s.length()-7)+""
				+s.charAt(s.length()-6)+""+s.charAt(s.length()-5);
		return value;
		}


}
