package cn.walter.demo01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map�ӿ��еĳ��÷���
 * 	ʹ��Map�ӿڵ�ʵ���� HashMap �����
 */
public class MapDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * �Ƴ������еļ�ֵ�ԣ����ر��Ƴ�֮ǰ��ֵ
	 * V remove(K)
	 */
	private static void function_2() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		String value = map.remove(1);
		System.out.println(value);
		System.out.println(map);
	}
	/*
	 * ͨ�������󣬻�ȡֵ����
	 * V get(K)
	 * ���������û�������������null
	 */
	private static void function_1() {
		//�������϶�����Ϊ���Ķ���������ֵ�Ķ���洢�ַ���
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		String s = map.get(1);//����1����Ӧ��ֵ
		System.out.println(s);
	}

	/*
	 * ����ֵ�Դ洢��������
	 * V put(K,V) k ��Ϊ���Ķ���V��Ϊֵ�Ķ���
	 * �洢�����ظ��ļ�����ԭ����ֵ����
	 * ����ֵһ������·���null
	 * �洢�ظ���ʱ�����ر�����֮ǰ��ֵ
	 */
	private static void function() {
		//�������϶���HashMap���洢���󣬴洢���󣬼����ַ�����ֵ������
		Map<String,Integer> map = new HashMap<String,Integer>();
		Integer i1 =map.put("a", 1);
		System.out.println(i1);
		map.put("b", 2);
		map.put("c", 3);
		Integer i2 =map.put("c", 4);
		System.out.println(i2); //�õ����ǵ�ֵ
		System.out.println(map);
		
	}

}
