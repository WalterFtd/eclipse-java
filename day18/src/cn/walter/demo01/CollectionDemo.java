package cn.walter.demo01;

import java.util.Collection;
import java.util.ArrayList;
/*
 * Collerction�ӿ��еķ���
 * �Ǽ���������ʵ�������ӵ�еķ���
 * ʹ��Collection�ӿڵ�ʵ���࣬�������ʾ
 * ArrayList implements List
 * List extends Collection
 * ������ִ�У�����ʵ�ֵ���д
 */
public class CollectionDemo {
	public static void main(String[] args) {
		function_3();
	}
	/*
	 * Collection�ӿڷ���
	 * boolean remove(Object o)�Ƴ�������ָ����Ԫ��
	 */
	private static void function_3() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("qw");
		coll.add("asa");
		System.out.println(coll);
		boolean b = coll.remove("qw");
		System.out.println(b);
		System.out.println(coll);
		 
		
		
		
	}

	/*
	 * Collection�ӿڷ���
	 * object[] toArray() �����е�Ԫ�أ�ר��һ�������е�Ԫ�أ�����ת������
	 * ���ص���һ���洢��������飬����Ĵ洢������Object����
	 */
	private static void function_2() {
		Collection<String> coll =  new ArrayList<String>();
		coll.add("qew");
		coll.add("sdds");
		Object[] objs = coll.toArray();
		for (int j = 0; j < objs.length; j++) {
			System.out.println(objs[j]);
		}
		
		
	}
	/*
	 * ѧϰjava�����ֳ��ȱ�����ʽ()
	 * 	����.length ����  ����ֵ int
	 * 	�ַ���.length() ����������ֵ int
	 * 	����.size()����������ֵ int
	 */
	
	

	/*
	 * Collection�ӿڷ���
	 * boolean contain(Object o)�ж϶����Ƿ�����ڼ����У�������ڷ���true
	 * ������Object����
	 */
	private static void function_1() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("asa");
		coll.add("sdd");
		int i = coll.size();//�м���Ԫ��
		System.out.println(i);
		boolean b = coll.contains("sa");
		System.out.println(b);
		
	}
	/*
	 * Collection�ӿڵķ���
	 * void clear() ��ռ����е�Ԫ��,���ϱ�������
	 */
	public static void function(){
		//�ӿڶ�̬�ķ�ʽ����
		Collection<String> coll = new ArrayList<String>();
		coll.add("123");
		coll.add("123");
		System.out.println(coll);
		coll.clear();
		
	}
}
