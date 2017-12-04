package cn.walter.demo04;
/*
 * 补全多态调用：编译和运行
 * 编译都看的是：左边的父类，父类中有，编译成功，没有，编译失败
 * 运行，静态方法，运行父类中的静态方法
 * 运行，非静态方法，运行子类的重写方法
 * 成员变量，编译运行全是父类
 * 
 * 静态常量：
 * 用public static final来修饰变量来完成定义
 * 一般在接口中使用
 */
public class Test {
	//常量都大写，单词之间用_来连接
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		//多态调用
		Fu f = new Zi();
		//静态变量可以直接用对象名来调用，或者用类名调用也可
		//编译运行都是看等号左边的
		System.out.println(f.i);
		//调用还是父类的静态方法，原因：静态属于类，不属于对象
		//对象的多态性，静态和对象无关，父类的引用，静态方法
		f.show();
		System.out.println(Test.PI);
		
		
	}
}
