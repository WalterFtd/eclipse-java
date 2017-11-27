package cn.walter.demo02;

public class Test {
	public static void main(String[] args) {
		//使用接口中定义的常量
		//常量被静态修饰，可以被类名直接调用，被接口的名字直接调用
		System.out.println(MyInter.x);
		MyInterImpl my = new MyInterImpl();
		my.show();
		int a = my.getSum(2, 3);
		System.out.println(a);
	}
}
