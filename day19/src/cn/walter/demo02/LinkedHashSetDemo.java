package cn.walter.demo02;

import java.util.LinkedHashSet;
/*
 * LinkedHashSet 基于链表的哈希表实现
 * 继承自HashSet
 * 
 * LinkHashSet 自身特性，具有顺序，存储和取出的顺序相同的
 * 线程不安全的集合，运行速度快
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(4);
		link.add(5);
		System.out.println(link);
	}
}
