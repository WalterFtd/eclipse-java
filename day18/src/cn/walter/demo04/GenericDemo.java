package cn.walter.demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * ���͵�ͨ���
 * �ļ�ϵͳ�е�ͨ���: *
 * 
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		HashSet<Integer> set = new HashSet<>();
		
		array.add("123");
		array.add("456");
		
		set.add(789);
		set.add(890);
		
		iterator(array);
		iterator(set);
	}
	/*
	 * ���巽��������ͬʱ����2������
	 * ��������ôʵ�֣�����дArrayList��Ҳ����дHashSet
	 * ������дArrayList��Hash�ĸ��࣬���߹�ͬʵ�ֵĽӿ�  �޸��࣬�нӿ�Collection
	 * ���͵�ͨ�����ƥ�����е���������  "?"
	 */
	private static void iterator(Collection<?> coll) {
		Iterator<?> it= coll.iterator();
		while(it.hasNext()){
			//it.next()��ȡ�Ķ���ʲô���ͣ��׶��ǲ��ܽ���ǿת�����Ա�������������
			System.out.println(it.next());
		}
	}
	
}
