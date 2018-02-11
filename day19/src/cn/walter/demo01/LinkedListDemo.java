package cn.walter.demo01;

import java.util.LinkedList;
/*
 * Linked 链表集合的特有功能
 * 	自身特点：链表底层实现，查询慢，增删快
 * 
 * 子类的特有功能，不能多态调用
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		funcion_2();
	}
	/*
	 * E removeFirst() 移除并返回链表的开头
	 * E removeFirst() 移除并返回链表的结尾
	 */
	private static void funcion_2() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("1");
		link.add("2");
		link.add("3");
		link.add("4");
		String first = link.removeFirst();
		String last = link.removeLast();
		System.out.println(first);
		System.out.println(last);
		
		System.out.println(link);
	}
	/*
	 * E getFirst() 获取链表的开头
	 * E getList() 获取链表的结尾
	 * java.util.NoSuchElementException
	 */
	private static void funcion_1() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("sd");
		link.add("sa");
		//link.clear();
		//if(!link.isEmpty()){} 
		if(link.size()!=0){
		String first = link.getFirst();
		String last = link.getLast();
		System.out.println(first);
		System.out.println(last);
		}
	}

	/*
	 * addFist(E) 添加到链表的开头
	 * addLast(E) 添加到链表的结尾
	 */
	private static void funcion() {
		LinkedList<String> link = new LinkedList<String>();
		link.add("sd");
		link.add("sa");
		
		link.addFirst("wede");
		link.addLast("sdsd");
		System.out.println(link);
		
	}
}
