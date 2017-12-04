package cn.walter.demo05;
/*
 * 有名字的对象，引用类型变量，可以反复使用
 * 匿名对象，没有引用变量，只能使用一次
 * 
 * 匿名对象可以当做参数传递
 * 匿名对象可以当返回值
 */
public class Test {
	public static void main(String[] args) {
		//使用多次
		Person p = new Person();
		p.eat();
		//使用一次
		new Person().eat();
		//当参数
		method(new Person());
		//当返回值
		Person p1 = method();
		p1.eat();
		
	}
	public static void method(Person p){
		p.eat();
	}
	//方法的重载，返回匿名对象
	//方法的返回值是Person类型
	//方法return语句，返回的是这个类的对象
	public static Person method(){
		return new Person();
	}
}
