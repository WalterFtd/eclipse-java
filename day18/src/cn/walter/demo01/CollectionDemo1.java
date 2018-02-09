package cn.walter.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * Collection coll = new ArrayList();不写参数类型的表示
 * 对象是Object类型的
 * 如果需要使用其他子类的方法，需要向下转型
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		//集合可以存储任何类型的对象
		//集合中，不指定存储的数据类型，集合什么都存
		Collection coll = new ArrayList();
		coll.add("sa");
		coll.add("sds");
		
		//迭代器
		Iterator it = coll.iterator();
		while(it.hasNext()){
			//it.next()获取出来的是什么数据类型，Object类
			//Object obj = it.next();
			//System.out.println(obj);
			//Object对象的向下转型，变成String类型，以便使用String对象的方法
			String s = (String)it.next();
			System.out.println(s.length());
			
		}
	}
}
