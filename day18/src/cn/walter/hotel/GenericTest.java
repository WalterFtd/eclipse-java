package cn.walter.hotel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 将酒店员工，厨师，服务员，经理，分别存储到3个集合中
 * 定义方法，可以遍历3个集合，遍历集合的同时，可以调用工作方法
 */
public class GenericTest {
	public static void main(String[] args) {
		//创建3个集合对象
		ArrayList<ChuShi> cs = new ArrayList<ChuShi>();
		ArrayList<FuWuYuan> fwy = new ArrayList<FuWuYuan>();
		ArrayList<JingLi> jl = new ArrayList<JingLi>();
		
		//每个集合存储自己的元素
		cs.add(new ChuShi("cs1","12"));
		cs.add(new ChuShi("cs2","13"));
		fwy.add(new FuWuYuan("fwy1","12"));
		fwy.add(new FuWuYuan("fwy","13"));
		jl.add(new JingLi("jl1","12",1111));
		jl.add(new JingLi("jl2","13",1111));
		iterator(cs);
		iterator(fwy);
		iterator(jl);
//		ArrayList<String> array = new ArrayList<String>();
//		iterator(array);
	}
	/*
	 * 定义方法，可以同时遍历三个集合，遍历三个集合的同时，可以调用工作方法
	 * ? 通配符，迭代器it.next方法取出的是Object类型，怎么调用work方法
	 * 强制转换： it.next() = Object o ==>Employee 转成父类(多态思想)，
	 * 问题那么其他的 ArrayList<E>类型怎么办(不安全因素)
	 * 方法参数：做个控制，可以传递Employee对象，也可以传递Employee的子类的对象
	 * 泛型的限定：本案例中，父类固定Employee，但子类可以无限 <?extends Employee>
	 *  ?extends Employee 限制的是父类，上限限定    可以传递Employee，传递他的子类对象
	 *  ?super Employee 限制的是子类，下限限定    可以传递Employee，传递他的父类对象
	 */

	private static void iterator(Collection<?extends Employee> coll) {
		Iterator<?extends Employee> it = coll.iterator();
		while(it.hasNext()){
			//获取出的next() 数据类型，是什么 Employee 父类类型，子类对象
			Employee em = it.next();
			System.out.println(em);
			em.work();
		}
		
	}
	
}
