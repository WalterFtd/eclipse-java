package cn.walter.demo03;
/*
 * ����
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * JDK1.5 �����µİ�ȫ���ƣ���֤����İ�ȫ��
 * 	���У�ָ���˼����д洢���ݵ�����<��������>
 * Collectio<String> coll = new ArrayList<String>();
 * ����ǿת������<>,�ó����ø���ȫ
 */
public class GenericDemo {
	public static void main(String[] args) {
		function();
	}

	private static void function() {
		Collection coll = new ArrayList();
		//��������棬����������ֵ�����Զ�װ���Integer���ͣ�����ǿת��String
		//coll.add(1);
		coll.add("sdds");
		coll.add("dsds");
		coll.add("sd");
		
		Iterator it = coll.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
		}
	}
	
}
