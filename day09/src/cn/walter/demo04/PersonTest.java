package cn.walter.demo04;

/*
 * 定义好的Person类进行测试
 * 创建对象，对象调用属性和方法
 */
public class PersonTest {

	public static void main(String[] args) {
		// 创建Person类的对象 new
		Person p = new Person();
		// 对成员变量赋值
		// p.age = 20;
		p.setAge(150);
		p.name = "小白";
		// 调用类中方法
		p.speak();
		
		//输入成员变量age值，必须调用get方法
		System.out.println(p.getAge());
	}

}
