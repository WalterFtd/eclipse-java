package cn.walter.demo01;

import java.util.ArrayList;
/*
 * 集合体系，
 * 	目标 集合本身是一个存储的容器
 *  1.必须使用集合存储对象
 *  2.遍历集合，取出对象
 *  3.集合自己的特性
 * 	例子：ArrayList本身就是一个可变数组->根据特性去选择集合容器
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 *集合ArrayList，存储int类型数
		 *集合本身不接受基本类，但有自动装箱机制变成包装类存储
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(11);
		array.add(12);
		array.add(13);
		array.add(14);
		array.add(15);
		for(int i = 0;i<array.size();i++){
			System.out.println(array.get(i));
		}
		/*
		 * 集合存储自定义的Person类的对象
		 */
		ArrayList<Person> arrayPer = new ArrayList<>();
		//可以往里面装匿名对象，也可以装有名对象
		arrayPer.add(new Person("a",20));
		arrayPer.add(new Person("b",19));
		arrayPer.add(new Person("c",18));
		for(int i = 0; i < arrayPer.size(); i++){
			//get(索引),就是Person对象
			//打印的是一个对象，必须调用toString()
			//如果子类重写了toString方法，则调用的是子类的重写方法 
			System.out.println(arrayPer.get(i));
		}
	}
}
