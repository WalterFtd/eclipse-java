package cn.walter.demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set �ӿڣ��ص㲻�ظ�Ԫ�أ�û����
 * set�ӿڵ�ʵ���࣬HashSet(��ϣ��)
 * �ص㣺���򼯺ϣ��洢��ȡ����˳��ͬ��û�����������洢�ظ�Ԫ��
 * ����ı�д�ϣ���ArrayList��ȫһ��
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("as1");
		set.add("as2");
		set.add("as3");
		set.add("as4");
		set.add("as4");
		set.add("as5");
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("=================");
		for(String s : set){
			System.out.println(s);
		}
	}

}
