package cn.walter.demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 集合操作的工具类
 * 	Collections
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * Collections.shuffle方法
	 * 对集合中的元素，进行随机排列
	 */
	public static void function_2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	/*
	 * Collections.binarySearch静态方法
	 * 对List集合进行二分查找，方法参数，传递List集合，传递被查找的元素
	 */
	public static void function_1(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//调用工具类静态方法binarySearch
		int index = Collections.binarySearch(list,0);
		//找不到则返回“-”插入点减1
		System.out.println(index);
	}
	/*
	 * Collections.sort静态方法
	 * 对于List集合有效，进行升序排序（）-->排序就要换位置比较，换位比较得依靠索引，而set集合是没有索引的
	 */
	public static void function(){
		//创建List集合
		//多态调用弊端：不能调用ArrayList的特有方法，但可以调用接口和实现类的公有部分
		List<String> list = new ArrayList<String>();
		list.add("scsx");
		list.add("ssx");
		list.add("ass");
		list.add("cxzcsx");
		System.out.println(list);
		//调用集合工具类的方法sort
		Collections.sort(list);
		System.out.println(list);
		
	}
}
