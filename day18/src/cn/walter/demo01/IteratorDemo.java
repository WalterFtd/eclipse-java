package cn.walter.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �����еĵ�����
 * 	��ȡ������Ԫ�ط�ʽ
 * �ӿ�Iterator:�������󷽷�
 *	boolean hasNext() �жϼ����л���û�п��Ա���ȡ������Ԫ�أ�����з���true
 *	next() ȡ�������е���һ��Ԫ��
 *
 * Iterator�ӿڣ���ʵ����
 * 	Collection�ӿڶ�����һ������������ֵ����Iterator����
 * 		Iterator()
 * 	��Ϊ���� ArrayList ����д���� iterator() ������Iterator�ӿڵ�ʵ����Ķ���
 * 	ʹ��ArrayList���ϵĶ���
 * 		Iterator it = array.iterator(),���нӿھ���Iterator�ӿڵ�ʵ����Ķ���
 * 		it�ǽӿڵ�ʵ������󣬵��÷���hasNext ��  next ����Ԫ�ص���
 * 	˼�룺����ӿڱ�̣��ӿھ���Iterator
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("ass");
		coll.add("dsd");
		System.out.println(coll);
		//���������Լ���Arraylist�е�Ԫ�ؽ���ȡ������
		
		//���ü��ϵķ���iterator()��ȡ����Iterator�ӿڵ�ʵ����Ķ���
		Iterator<String> it = coll.iterator(); //�ӿڵ�������һ��ʵ����Ķ���ʵ����Ķ���ͨ����������
		//�ӿ�ʵ����Ķ��󣬵��÷���hasNest()�жϼ������Ƿ���Ԫ��
		boolean b = it.hasNext();
		System.out.println(b);
		//�ӿڵ�ʵ������󣬵��÷���next()ȡ�������е�Ԫ��
		//String s = it.next(); 
		//System.out.println(s);
		
		//������һ�������Ĺ��̣�ʹ��ѭ��ʵ�֣�while
		//�������Ǽ��ϵ�ͨ��ģʽ�����ü��Ͼ���ʹ��
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
