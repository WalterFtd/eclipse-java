package cn.walter.demo02;

import java.util.LinkedHashMap;

/*
 * LinkHashMap继承HashMap
 * 保证迭代的顺序
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String,String> link = new LinkedHashMap<String,String>();
		link.put("a1", "11");
		link.put("a2", "12");
		link.put("a3", "13");
		link.put("a4", "14");
		System.out.println(link);
	}
}
