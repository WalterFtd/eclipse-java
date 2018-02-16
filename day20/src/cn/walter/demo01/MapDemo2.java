package cn.walter.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϻ�ȡ��ʽ
 * entrySet����������ֵ��Ӧӳ���ϵ��ȡ
 * ʵ�ֲ��裺
 * 	1.����map���Ϸ���entrySet()�������е�ӳ���ϵ���󣬴洢��Set������
 * 		set<Entry<K,V>>
 * 	2.����Set����
 * 	3.��ȡ����Set���ϵ�Ԫ�أ���ӳ���ϵ����
 * 	4.ͨ��ӳ���ϵ���󷽷�getKey getValue ��ȡ��ֵ��
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "wqa");
		map.put(2, "sd");
		map.put(3, "fdf");
		//����map���Ϸ���entrySet�������е�ӳ���ϵ���󣬴洢��Set����
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry <Integer,String>> it = set.iterator();
		while(it.hasNext()){
			//3.��ȡ����Set���ϵ�Ԫ�أ���ӳ���ϵ����
			//it.next ��ȡ����Map.Entry����
			Map.Entry <Integer,String> entry = it.next();
			//4.ͨ��ӳ���ϵ���󷽷� getKey(),getValue()��ȡ��ֵ��
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +"..."+ value);
		}
		System.out.println("==================");
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +"..."+ value);
			
		}
	}
}
