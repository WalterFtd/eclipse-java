package cn.walter.demo02;

import java.util.HashMap;
import java.util.Map;

/*
 * ʹ��HashMap���ϣ��洢�Զ���Ķ���
 * �Զ��������Ϊ�������֣���Ϊֵ����
 */
public class HashMapDemo {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * HashMap �洢�Զ������Person,��Ϊ������
	 * ���Ķ�����Person���ͣ�ֵ���ַ���
	 * ��֤����Ψһ�ԣ��洢�����Ķ�����дhashCode equals
	 */
	private static void function_1() {
		HashMap<Person,String> map = new HashMap<Person,String>();
		//��֤Ψһ����дequals��hashCode
		map.put(new Person("q",20),"sdsd");
		map.put(new Person("q",20),"sdsd");
		map.put(new Person("wds",21),"2sdsd");
		map.put(new Person("ds",22),"ssdjksd");
		for(Person key : map.keySet()){
			String value = map.get(key);
			System.out.println(key+"..."+value);
		}
		System.out.println("============");
		for(Map.Entry<Person, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}
	}
	/*
	 * Hash �洢�Զ���Ķ���Person����Ϊֵ����
	 * ���Ķ������ַ��������Ա�֤Ψһ��
	 */

	

	private static void function() {
		HashMap<String,Person> map = new HashMap<String,Person>();
		map.put("beijing", new Person("sd",20));
		map.put("tianjing", new Person("yd",21));
		map.put("sahnghai", new Person("we",22));
		for(String key : map.keySet()){
			Person value = map.get(key);
			System.out.println(key+"..."+value);
		}
		System.out.println("================");
		for(Map.Entry<String, Person> entry : map.entrySet()){
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(key +"..."+value);
		}
	}
	
}
