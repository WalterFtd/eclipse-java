package cn.walter.demo02;

public class Test {
	public static void main(String[] args) {
		//调用Person类的对象
		//就是在调用他的构造方法
		
		//1.调用空参数的构造方法，创建对象
		Person p1 = new Person();
		p1.setName("小强");
		p1.setAge(10);
		System.out.println(p1.getName()+"年龄"+p1.getAge());
		//调用2个参数的构造方法，创建对象
		Person p2 = new Person("强达人",5);
		
		System.out.println(p2.getName()+"年龄"+p2.getAge());
	}
}
