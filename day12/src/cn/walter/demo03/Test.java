package cn.walter.demo03;

public class Test {
	public static void main(String[] args) {
		//创建Person的对象，调用的是空参数的构造方法
		//运行出来的结果是null 0
		Person p = new Person();
		
		 System.out.println(p.getName());
		 System.out.println(p.getAge());
	}
}
