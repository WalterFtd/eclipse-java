package cn.walter.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * �������Ĳ����޸��쳣
 * ConcurrentModificationException
 * �����ڱ�����ͬʱ�޸��˼��ϵĳ��� ��Ԫ�ظ�û��ϵ��
 */
public class ListDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asa1");
		list.add("asa2");
		list.add("asa3");
		list.add("asa4");
		list.add("asa5");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			if(s.equals("asa3")){
				list.add("qw");
			}
			System.out.println(s);
		}
	}
	
}
