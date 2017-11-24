package cn.walter.demo04;

/*
 * 描述现实生活中的人的事物
 * 		属性：姓名 年龄
 * 		功能：说话
 * 出现安全问题，age问题，可能出现赋值为负数的情况
 * 负数不会导致程序问题，违反生活中的真实情况
 * 
 * 提高安全问题：让外面的类，不允许直接调用我的成员变量
 * 新的关键字 private，私有 ，属于成员修饰符，不能修饰局部变量
 * 被private修饰的成员，只能在自己的本类中被使用
 * 
 * 类中不需要对外提供的内容都私有化，包括属性和方法
 * 以后再描述事物，属性都私有化，并提供set和get方法对其进行访问。
 * 私用仅仅是封装的体现形式
 * 
 * 对私用变量，提供公共的访问方式：方法 
 * 提供两套方法：赋值set，取值get
 */
public class Person {
	// 人的名字，成员变量
	String name;
	// 人的年龄，成员变量
	private int age;

	// 变量age被私有，提供方法，让外面的类使用
	// 定义方法，对age变量进行赋值，方法名字，必须set开头
	public void setAge(int a) {
		// 对变量参数a进行范围限制
		if (a < 0 || a > 150) {
			// 如果a超过范围，手动将age赋值为20
			age = 20;
		} else {
			// 如果a在范围内，直接对age赋值
			age = a;
		}
	}
	//定义方法，对变量age获取值使用，方法名字get
	public int getAge(){
		return age;
	}
	// 定义人的说话功能，方法中，要求说出自己的姓名和年龄
	public void speak() {
		System.out.println(name + "....." + age);
	}
}
