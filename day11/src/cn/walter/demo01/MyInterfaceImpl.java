package cn.walter.demo01;
/*
 * 定义类，实现接口（和继承差不多），重写接口中的抽象方法
 * 创建实现类的对象
 * 
 * 类实现接口，可以理解为继承
 * 
 * 关键字 implements
 * class 类  implements 接口{
 * 		重写接口中的抽象方法
 * }
 */
public class MyInterfaceImpl implements MyInterface {
	public void function() {
		System.out.println("实现类，重写接口抽象方法");
	}

}
