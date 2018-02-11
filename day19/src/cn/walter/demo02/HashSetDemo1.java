package cn.walter.demo02;

import java.util.HashSet;

import cn.walter.demo03.Person;

/*
 * HashSet集合的自身特点
 * 	底层数据结构，哈希表
 * 	存储，取出都比较快
 * 	线程不安全，运行速度快
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		/*HashSet<String> set = new HashSet<String>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new String("bbc"));
		set.add(new String("bbc"));
		System.out.println(set);*/
		
		//将Person对象中的姓名，年龄，相同数据，看做同一个对象
		//判断对象 是否重复，依赖对象自己的方法hashCode,equals
		HashSet<Person> setPerson = new HashSet<Person>();
		setPerson.add(new Person("a",20));
		setPerson.add(new Person("b",21));
		setPerson.add(new Person("b",21));//从理论上不是同一个对象
		setPerson.add(new Person("c",22));
		setPerson.add(new Person("d",23));
		System.out.println(setPerson);
		
	}
}
