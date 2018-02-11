package cn.walter.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 迭代器的并发修改异常
 * ConcurrentModificationException
 * 就是在遍历的同时修改了集合的长度 （元素改没关系）
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asa1");
		list.add("asa2");
		list.add("asa3");
		list.add("asa4");
		list.add("asa5");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("asa3")){
				list.add("qw");
			}
			System.out.println(s);
		}
	}
	
}
