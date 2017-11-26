package cn.walter.demo05;

/*
 * 类描述人：
 * 属性：姓名和年龄
 * 方法：说话
 * 
 * 私有化所有的属性（成员变量），必须写对应的get/set方法
 * 凡是自定义的类，自定义成员变量，应该私有化，提供get/set
 * 
 * this,区分成员变量和局部变量的同名问题
 * 方法中，访问成员变量，写this
 * this:本类的对象引用
 */
public class Person {
	private String name;
	private int age;
	//set方法，变量name，age赋值
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//get方法，变量name，age获取值
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void speak() {
		String name ="fdf";
		int age = 25;
		System.out.println("人在说话 "+this.name + "....." +this.age);
	}
}
