package cn.walter.demo10;
/*
 * 仅在本类中使用：private
 * 在本包中访问：默认 default
 * 在本包中使用且能在其他包的子类中使用：protected
 * 所有包，所有类访问:public
 */
public class A {
	int i = 1;
	protected void abc(){
		System.out.println("ABC");
	}
}
