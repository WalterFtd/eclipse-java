package cn.walter.demo10;
/*
 * 仅在本类中使用：private
 * 在本包中访问：默认 default
 * 在本包中使用且能在其他包的子类中使用：protected
 * 所有包，所有类访问:public
 * 注意，如果类用public 修饰，则类名必须与文件名相同，一个文件只能有一个被public修饰的类
 */
public class A {
	int i = 1;
	protected void abc(){
		System.out.println("ABC");
	}
}
