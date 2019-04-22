package com.ChenZhiJin.StringUtiltest;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/*
 * @author:ChenZhiJin
 * @time 2019-4-22
 * 
 * */
public class WebUtilsTest {
	static HttpServletRequest request;
	   public static void main(String[] args) {
		   getString();
	   }
	   
	   
	   //获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值
   public static String getString(){
	    //实现代码
	   String defaultValue ="默认值";
	   String name = request.getParameter("name");
	   if(name.isEmpty()){
		   return defaultValue;
	   }else{
		   return name;
	   }
	}
   
   
     //获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值
   public static int getInt(){
	    //实现代码
	   int defaultValue = 0;
	   String regs = "^\\d{1,}$";
	   String name = request.getParameter("name");
	   if(name.isEmpty()){
		   return defaultValue;
	   }else if(name.matches(regs)){
		   return 1;
	   }else{
		   return defaultValue;
	   }
	}
   
   //获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false
   public static boolean getBoolean(){
	    //实现代码
	   String name = request.getParameter("name");
	   if(name.equals("true") || name.equals("false")){
		   return true;
	   }else{
		   return false;
	   }
	}
   
   
   //获取当前请求地址，注意参数不能丢
   public String getUrl(){
	    //实现代码
	   String path = request.getServletPath();
	   return path;
	}
    
   
   // 方法5：给定一个Cookie名获得取Cookie值 (5分)
   public String getCookieValue(){
       //实现代码
	   Cookie[] cookies = request.getCookies();
	   return cookies+"";
   }

}