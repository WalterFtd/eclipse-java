package cn.walter.demo04;
//A对象和B对象只能通过类名调用静态成员获得，不允许自己new，保证A锁和B锁在程序中的唯一性
public class LockA {
	private LockA(){
		//私有的构造方法，不给外类调用	
	}
	//静态调用是不需要对象的所以用static修饰，不想被改动，用final修饰，权限用public
	public static final LockA Locka = new LockA();
}
