package cn.walter.demo02;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private /*transient阻止成员变量序列化*/ int age;
	static final long serialVersionUID = 42L;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		super();
	}

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

	@Override
	public String toString() {
		return "Penson [name=" + name + ", age=" + age + "]";
	}
	
	
}
