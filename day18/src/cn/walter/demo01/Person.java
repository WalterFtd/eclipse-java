package cn.walter.demo01;
/*
 * Person�� 
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
	//���һ��object�����toString����
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//����������췽��
	public Person(){};//�ղ����Ĺ��췽��
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
}
