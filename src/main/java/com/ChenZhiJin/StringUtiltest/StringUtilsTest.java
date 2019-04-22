package com.ChenZhiJin.StringUtiltest;

import org.apache.commons.lang.StringUtils;

/*
 * @author:ChenZhiJin
 * @time 2019-4-22
 * 
 * */
public class StringUtilsTest {
	static StringUtils su;
	
	public static void main(String[] args) {
		String str1 = "abc";
	//	boolean flag1 = hasLength(str1);
	//	System.out.println(flag1);
		
		
		String str2 = " ";
		//boolean flag2 = hasText(str2);
		//System.out.println(flag2);
		
		String str3 ="15227813629";
		//boolean flag3 = isMobile(str3);
		//System.out.println(flag3);
		
		
		String str4 = "www.123456@.com";
		//boolean flag4 = isEmail(str4);
		//System.out.println(flag4);
		
		String str5 = "abcdde";
		String str = reverses(str5);
		System.out.println(str);
	}
	
	
	//判断源字符串是否有值，空引号(空白字符串)和也算没值
	public static boolean hasLength(String src){
	    //实现代码
		if(su.isNotEmpty(src)){
			System.out.println("该字符串不为空");
			return true;
		}else{
			System.out.println("该字符串为空");
			return false;
		}
	}
	
	
	//判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public static boolean hasText(String src){
	    //实现代码
		if(su.isNotBlank(src)){
			System.out.println("该字符串不为空");
			return true;
		}else{
			System.out.println("该字符串为空");
			return false;
		}
	}
	
	//判断是否为手机号码 (5分)
	public static boolean isMobile(String src){
		String regs = "^1\\d{10}$";
		if(src.matches(regs)){
			System.out.println("电话号码符合规则");
			return true;
		}else{
			System.out.println("电话号码输入不符");
			return false;
		}
	}
	
	//判断是否为邮箱 (5分)
	public static boolean isEmail(String src){
	    //实现代码
		String regs = "^w{3}\\w{3,10}@(.com,.cn)";
		if(src.matches(regs)){
			return true;
		}else{
			return false;
		}
	}
	
	//反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public static String reverses(String src){
	    //实现代码
		String str = su.reverse(src);
		return str;
	}


}