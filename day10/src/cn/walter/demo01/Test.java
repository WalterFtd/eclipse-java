package cn.walter.demo01;
/*
 * 测试类
 * 继承的好处：
 * 	1.提高了代码的复用性
 * 	2.让类与类之间产生了关系，提供了多态的前提
 * 
 * 注意：Java只支持单继承，一个类只有一个直接父类
 * 
 */
public class Test {

	public static void main(String[] args) {
		//创建研发部员工类的对象
		Develop d = new Develop();
		//子类的对象，可以调用父类中的成员
		d.name = "小明";
		d.print();
		d.work();
		
		//创建维护员工类的对象
		WeiHu w = new WeiHu();
		w.name = "小康";
		w.print();
		w.work();
	}
}
