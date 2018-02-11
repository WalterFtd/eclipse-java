package cn.walter.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set 接口，特点不重复元素，没索引
 * set接口的实现类，HashSet(哈希表)
 * 特点：无序集合，存储和取出的顺序不同，没有索引，不存储重复元素
 * 代码的编写上，和ArrayList完全一致
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("as1");
		set.add("as2");
		set.add("as3");
		set.add("as4");
		set.add("as4");
		set.add("as5");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("=================");
		for(String s : set){
			System.out.println(s);
		}
	}

}
