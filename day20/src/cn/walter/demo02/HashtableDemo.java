package cn.walter.demo02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Map接口实现类Hashtable
 * 底层数据结果哈希表，特点和HashMap是一样的
 * Hashtable 线程安全集合，运行速度慢
 * HashMap 线程不安全的集合，运行速度快
 * 
 * Hashtable命运和Vector是一样的，从JDK1.2开始，被更先进的HashMap取代
 * 
 * HashMap允许存储null值，null键
 * Hashtable不允许存储null值，null键
 * 
 * Hashtable的子类Properties,依旧活跃在开发舞台
 */
public class HashtableDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put(null,null);
		System.out.println(map);
		
		Map<String,String> map1 = new Hashtable<String,String>();
		map1.put(null,null);
		System.out.println(map1);
	}
	
	
}
