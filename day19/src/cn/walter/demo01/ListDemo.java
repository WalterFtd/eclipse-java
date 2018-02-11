package cn.walter.demo01;

import java.util.ArrayList;
import java.util.List;
/*
 * List接口派系，继承Collection接口
 * 	下面有很多实现类
 * List接口特点：有序，索引，可以重复元素
 * 	实现类，ArrayList，linkedList
 * 
 * List接口中的抽象方法，有一部分方法和Collection相同
 * List接口自己特有fangfa：带索引的功能
 */
public class ListDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * E set(int index,E)
	 * 修改指定索引上的元素
	 * 返回被修改之前的元素
	 */
	
	private static void function_2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer i = list.set(0, 5);
		System.out.println(i);
		System.out.println(list);
	}

	/*
	 * remove(int Index)
	 * 移除指定索引上的元素
	 */
	private static void function_1() {
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		
		Double d = list.remove(0);//不单单删除，还返回删除的值
		System.out.println(d);
		System.out.println(list);
		
	}

	/*
	 * add(int index , E)
	 * 将元素插入到列表的指定索引上
	 * 带有索引的操作，要防止越界问题
	 * java.lang.IndexOutOfBoundsException  集合越界异常
	 * 		ArraysIndexOutOfBoundsException  数组越界异常
	 *  	StringIndexOutOfBoundsException	 字符串越界异常
	 */
	public static void function(){
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		list.add(3, "dsdsd");
		System.out.println(list);
		//get(索引)
		System.out.println(list.get(3));
	}
}
