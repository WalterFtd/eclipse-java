package cn.walter.demo07;
/*
 * 需要在创建工人对象就明确姓名和年龄
 * new Worker 同时给出姓名和年龄
 * new Worker("abc",20)
 */
public class Worker extends Person{
	public Worker(String name,int age){
		super(name,age);
	}
}
