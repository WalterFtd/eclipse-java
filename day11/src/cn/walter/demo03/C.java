package cn.walter.demo03;
/*
 * 类C，同时去实现2个接口，接口A,B
 * 作为实现类，C，全部重写两个接口的所有抽象方法，才能建立C类的对象
 * 注意：要避免方法的重复定义，出现了只能舍弃一个接口
 * 
 * C类，在继承一个类的同时，可以实现多个接口
 * 接口是最简单的，所有的任务都压在实现类里面
 */
public class C extends D implements A,B {

	public void a() {
		
	}

	public void b() {
		
	}

	public void d() {
		
	}

}
