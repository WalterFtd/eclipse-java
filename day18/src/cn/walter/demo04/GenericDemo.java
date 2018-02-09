package cn.walter.demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 泛型的通配符
 * 文件系统中的通配符: *
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		HashSet<Integer> set = new HashSet<>();
		
		array.add("123");
		array.add("456");
		
		set.add(789);
		set.add(890);
		
		iterator(array);
		iterator(set);
	}
	/*
	 * 定义方法，可以同时迭代2个集合
	 * 参数：怎么实现，不能写ArrayList，也不能写HashSet
	 * 参数：写ArrayList和Hash的父类，或者共同实现的接口  无父类，有接口Collection
	 * 泛型的通配符，匹配所有的数据类型  "?"
	 */
	private static void iterator(Collection<?> coll) {
		Iterator<?> it= coll.iterator();
		while(it.hasNext()){
			//it.next()获取的对象，什么类型，弊端是不能进行强转，可以遍历，其他不行
			System.out.println(it.next());
		}
	}
	
}
