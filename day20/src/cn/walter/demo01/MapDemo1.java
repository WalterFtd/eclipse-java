package cn.walter.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı���
 * ���ü���ȡֵ
 * Map�ӿ��ж���ķ���keySet
 * ���õļ����洢��Set���� 
 */
public class MapDemo1 {
	public static void main(String[] args) {
		/*
		 * 1.����map���ϵķ���keySet�����еļ��洢��Set������
		 * 2.����Set���ϣ�������������ǿfor����ȡ��Set����������Ԫ��(Map�еļ�)
		 * 3.����map���Ϸ���get��ͨ������ȡ��ֵ
		 */
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		//1.����map���ϵķ���keySet�����õļ��洢��Set������
		Set<String> set = map.keySet();
		//2.����Set���ϣ���ȡ��Set�����е�����Ԫ��(Map�еļ�)
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			//it.next���ص�ʱ��Set����Ԫ�أ�Ҳ����Map�еļ�
			//3.����map���Ϸ���get��ͨ������ȡ��ֵ
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key+".."+value);
		}
		System.out.println("===========");
		for(String key:set){
			Integer value = map.get(key);
			System.out.println(key+".."+value);
		}
	}
}
