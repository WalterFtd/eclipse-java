package cn.walter.demo01;

import java.util.LinkedList;
/*
 * Linked �����ϵ����й���
 * 	�����ص㣺����ײ�ʵ�֣���ѯ������ɾ��
 * 
 * ��������й��ܣ����ܶ�̬����
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		funcion_2();
	}
	/*
	 * E removeFirst() �Ƴ�����������Ŀ�ͷ
	 * E removeFirst() �Ƴ�����������Ľ�β
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
	 * E getFirst() ��ȡ����Ŀ�ͷ
	 * E getList() ��ȡ����Ľ�β
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
	 * addFist(E) ��ӵ�����Ŀ�ͷ
	 * addLast(E) ��ӵ�����Ľ�β
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
