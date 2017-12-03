package cn.walter.demo03;
/*
 * 定义Person类
 * 定义对象的特有数据，和对象的共享数据
 * 对象的特有数据（非静态修饰） 调用者只是new的对象
 * 对象的共享数据（静态修饰） 调用者可以是new的对象，也可以是类名
 * 
 * 实现对象的共享数据，在数据的前面加入static修饰
 * 被静态修饰的成员，可以直接被类名字直接调用
 */
public class Person {
	String name;
	
	static String className;
}
