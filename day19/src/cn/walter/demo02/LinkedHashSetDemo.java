package cn.walter.demo02;

import java.util.LinkedHashSet;
/*
 * LinkedHashSet ��������Ĺ�ϣ��ʵ��
 * �̳���HashSet
 * 
 * LinkHashSet �������ԣ�����˳�򣬴洢��ȡ����˳����ͬ��
 * �̲߳���ȫ�ļ��ϣ������ٶȿ�
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
