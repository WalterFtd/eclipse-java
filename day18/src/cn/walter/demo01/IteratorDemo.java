package cn.walter.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 集合中的迭代器
 * 	获取集合中元素方式
 * 接口Iterator:两个抽象方法
 *	boolean hasNext() 判断集合中还有没有可以被抽取出来的元素，如果有返回true
 *	next() 取出集合中的下一个元素
 *
 * Iterator接口，找实现类
 * 	Collection接口定义了一个方法，返回值就是Iterator类型
 * 		Iterator()
 * 	作为子类 ArrayList 会重写方法 iterator() 返回了Iterator接口的实现类的对象
 * 	使用ArrayList集合的对象
 * 		Iterator it = array.iterator(),运行接口就是Iterator接口的实现类的对象
 * 		it是接口的实现类对象，调用方法hasNext 和  next 集合元素迭代
 * 	思想：面相接口编程，接口就是Iterator
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("ass");
		coll.add("dsd");
		System.out.println(coll);
		//迭代器，对集合Arraylist中的元素进行取出操作
		
		//调用集合的方法iterator()获取出，Iterator接口的实现类的对象
		Iterator<String> it = coll.iterator(); //接口的引用是一个实现类的对象，实现类的对象通过方法调用
		//接口实现类的对象，调用方法hasNest()判断集合中是否有元素
		boolean b = it.hasNext();
		System.out.println(b);
		//接口的实现类对象，调用方法next()取出集合中的元素
		//String s = it.next(); 
		//System.out.println(s);
		
		//迭代是一个反复的过程，使用循环实现，while
		//迭代器是集合的通用模式，所用集合均可使用
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
