package cn.walter.demo01;
/*
 * Person类 
 */
public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//添加一个object里面的toString方法
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//添加两个构造方法
	public Person(){};//空参数的构造方法
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
}
