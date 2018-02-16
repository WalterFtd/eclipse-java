package cn.walter.demo01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map接口中的常用方法
 * 	使用Map接口的实现类 HashMap 无序的
 */
public class MapDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * 移除集合中的键值对，返回被移除之前的值
	 * V remove(K)
	 */
	private static void function_2() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		String value = map.remove(1);
		System.out.println(value);
		System.out.println(map);
	}
	/*
	 * 通过键对象，获取值对象
	 * V get(K)
	 * 如果集合中没有这个键，返回null
	 */
	private static void function_1() {
		//创建集合对象，作为键的对象整数，值的对象存储字符串
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		String s = map.get(1);//返回1键对应的值
		System.out.println(s);
	}

	/*
	 * 将键值对存储到集合中
	 * V put(K,V) k 作为键的对象，V作为值的对象
	 * 存储的是重复的键，将原来的值覆盖
	 * 返回值一般情况下返回null
	 * 存储重复键时，返回被覆盖之前的值
	 */
	private static void function() {
		//创建集合对象，HashMap，存储对象，存储对象，键是字符串，值是整数
		Map<String,Integer> map = new HashMap<String,Integer>();
		Integer i1 =map.put("a", 1);
		System.out.println(i1);
		map.put("b", 2);
		map.put("c", 3);
		Integer i2 =map.put("c", 4);
		System.out.println(i2); //得到覆盖的值
		System.out.println(map);
		
	}

}
