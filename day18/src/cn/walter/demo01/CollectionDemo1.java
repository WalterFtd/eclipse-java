package cn.walter.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * Collection coll = new ArrayList();��д�������͵ı�ʾ
 * ������Object���͵�
 * �����Ҫʹ����������ķ�������Ҫ����ת��
 */
public class CollectionDemo1 {
	public static void main(String[] args) {
		//���Ͽ��Դ洢�κ����͵Ķ���
		//�����У���ָ���洢���������ͣ�����ʲô����
		Collection coll = new ArrayList();
		coll.add("sa");
		coll.add("sds");
		
		//������
		Iterator it = coll.iterator();
		while(it.hasNext()){
			//it.next()��ȡ��������ʲô�������ͣ�Object��
			//Object obj = it.next();
			//System.out.println(obj);
			//Object���������ת�ͣ����String���ͣ��Ա�ʹ��String����ķ���
			String s = (String)it.next();
			System.out.println(s.length());
			
		}
	}
}
