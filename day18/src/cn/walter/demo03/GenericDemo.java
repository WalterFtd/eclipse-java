package cn.walter.demo03;
/*
 * 范行
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * JDK1.5 出现新的安全机制，保证程序的安全性
 * 	范行：指明了集合中存储数据的类型<数据类型>
 * Collectio<String> coll = new ArrayList<String>();
 * 不用强转，加入<>,让程序变得更安全
 */
public class GenericDemo {
	public static void main(String[] args) {
		function();
	}

	private static void function() {
		Collection coll = new ArrayList();
		//会产生警告，如果存的是数值，会自动装箱成Integer类型，则不能强转成String
		//coll.add(1);
		coll.add("sdds");
		coll.add("dsds");
		coll.add("sd");
		
		Iterator it = coll.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
		}
	}
	
}
