package com.ChenZhiJin.StringUtiltest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @author:ChenZhiJin
 * @time 2019-4-22
 * 
 * */
public class CollectionUtilTest {
     public static void main(String[] args) {
		List list = new ArrayList<Object>();
		//boolean flag1 = notEmpty(list);
		//System.out.println(flag1);
		
		Map map = new HashMap();
		boolean flag2 = notMapEmpty(map);
		System.out.println(flag2);
	 }
     
     
     //判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值
     public static boolean notEmpty(List list){
    	    //实现代码
    	 if(list.indexOf(null)==0){
    		 System.out.println("该集合为空集");
    		 return false;
    	 }else if (list.size()>0){
    		 return true;
    	 }else{
    		 System.out.println("该集合为空集");
    		 return false;
    	 }
     }
     
     
     //判断Map集合是否有元素，对象为空或对象中没有元素都算没值
     public static boolean notMapEmpty(Map map){
    	    //实现代码
    	 Set keySet = map.keySet();
    	 boolean equals = keySet.equals(null);
    	 if(equals!=true){
    		 System.out.println("该集合为空集");
    		 return false;
    	 }else if(map.isEmpty()){
    		 System.out.println("该集合为空集");
    		 return false;
    	 }
    	 return true;
     }

}