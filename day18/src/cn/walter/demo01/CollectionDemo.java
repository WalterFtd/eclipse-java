package cn.walter.demo01;

import java.util.Collection;
import java.util.ArrayList;
/*
 * Collerction接口中的方法
 * 是集合中所有实现类必须拥有的方法
 * 使用Collection接口的实现类，程序的演示
 * ArrayList implements List
 * List extends Collection
 * 方法的执行，都是实现的重写
 */
public class CollectionDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * Collection接口方法
	 * boolean remove(Object o)移除集合中指定的元素
	 */
	private static void function_3() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("qw");
		coll.add("asa");
		System.out.println(coll);
		boolean b = coll.remove("qw");
		System.out.println(b);
		System.out.println(coll);
		 
		
		
		
	}

	/*
	 * Collection接口方法
	 * object[] toArray() 集合中的元素，专成一个数组中的元素，集合转成数组
	 * 返回的是一个存储对象的数组，数组的存储类型是Object类型
	 */
	private static void function_2() {
		Collection<String> coll =  new ArrayList<String>();
		coll.add("qew");
		coll.add("sdds");
		Object[] objs = coll.toArray();
		for (int j = 0; j < objs.length; j++) {
			System.out.println(objs[j]);
		}
		
		
	}
	/*
	 * 学习java中三种长度表现形式()
	 * 	数组.length 属性  返回值 int
	 * 	字符串.length() 方法，返回值 int
	 * 	集合.size()方法，返回值 int
	 */
	
	

	/*
	 * Collection接口方法
	 * boolean contain(Object o)判断对象是否存在于集合中，对象存在返回true
	 * 方法是Object类型
	 */
	private static void function_1() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("asa");
		coll.add("sdd");
		int i = coll.size();//有几个元素
		System.out.println(i);
		boolean b = coll.contains("sa");
		System.out.println(b);
		
	}
	/*
	 * Collection接口的方法
	 * void clear() 清空集合中的元素,集合本身还存在
	 */
	public static void function(){
		//接口多态的方式调用
		Collection<String> coll = new ArrayList<String>();
		coll.add("123");
		coll.add("123");
		System.out.println(coll);
		coll.clear();
		
	}
}
