package cn.walter.demo12;
/*
 * 静态代码块，只执行一次
 * 构造代码块，new一次，就执行一次，优于构造方法
 * 构造方法，new 一次，就执行一次
 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("我是构造方法");
	}
	//构造代码块
	{
		System.out.println("我是构造代码块");
	}
	
	//静态代码块，最先执行
	static{
		System.out.println("我是静态代码块");
	}
}
