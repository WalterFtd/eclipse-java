package cn.walter.demo05;
/*
 * 多态的调用方法永远运行子类的重写
 */
public class Test {
	public static void main(String[] args) {
		//Java中，对象的多态性，调用程序中的方法
		//公式：父类类型或者是接口类型  变量 = new 子类的对象
		Fu z = new Zi();
		z.show();
		
		//抽象类Animal，子类是Cat
		Animal a = new Cat();
		a.eat();
		
		Smoking sk = new Student();
		sk.smoking();
	}
}
