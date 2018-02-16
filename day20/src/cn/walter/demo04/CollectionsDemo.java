package cn.walter.demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ���ϲ����Ĺ�����
 * 	Collections
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * Collections.shuffle����
	 * �Լ����е�Ԫ�أ������������
	 */
	public static void function_2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	/*
	 * Collections.binarySearch��̬����
	 * ��List���Ͻ��ж��ֲ��ң���������������List���ϣ����ݱ����ҵ�Ԫ��
	 */
	public static void function_1(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//���ù����ྲ̬����binarySearch
		int index = Collections.binarySearch(list,0);
		//�Ҳ����򷵻ء�-��������1
		System.out.println(index);
	}
	/*
	 * Collections.sort��̬����
	 * ����List������Ч�������������򣨣�-->�����Ҫ��λ�ñȽϣ���λ�Ƚϵ�������������set������û��������
	 */
	public static void function(){
		//����List����
		//��̬���ñ׶ˣ����ܵ���ArrayList�����з����������Ե��ýӿں�ʵ����Ĺ��в���
		List<String> list = new ArrayList<String>();
		list.add("scsx");
		list.add("ssx");
		list.add("ass");
		list.add("cxzcsx");
		System.out.println(list);
		//���ü��Ϲ�����ķ���sort
		Collections.sort(list);
		System.out.println(list);
		
	}
}
