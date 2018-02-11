package cn.walter.demo01;

import java.util.ArrayList;
import java.util.List;
/*
 * List�ӿ���ϵ���̳�Collection�ӿ�
 * 	�����кܶ�ʵ����
 * List�ӿ��ص㣺���������������ظ�Ԫ��
 * 	ʵ���࣬ArrayList��linkedList
 * 
 * List�ӿ��еĳ��󷽷�����һ���ַ�����Collection��ͬ
 * List�ӿ��Լ�����fangfa���������Ĺ���
 */
public class ListDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * E set(int index,E)
	 * �޸�ָ�������ϵ�Ԫ��
	 * ���ر��޸�֮ǰ��Ԫ��
	 */
	
	private static void function_2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer i = list.set(0, 5);
		System.out.println(i);
		System.out.println(list);
	}

	/*
	 * remove(int Index)
	 * �Ƴ�ָ�������ϵ�Ԫ��
	 */
	private static void function_1() {
		List<Double> list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		
		Double d = list.remove(0);//������ɾ����������ɾ����ֵ
		System.out.println(d);
		System.out.println(list);
		
	}

	/*
	 * add(int index , E)
	 * ��Ԫ�ز��뵽�б��ָ��������
	 * ���������Ĳ�����Ҫ��ֹԽ������
	 * java.lang.IndexOutOfBoundsException  ����Խ���쳣
	 * 		ArraysIndexOutOfBoundsException  ����Խ���쳣
	 *  	StringIndexOutOfBoundsException	 �ַ���Խ���쳣
	 */
	public static void function(){
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		list.add(3, "dsdsd");
		System.out.println(list);
		//get(����)
		System.out.println(list.get(3));
	}
}
