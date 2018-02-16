package cn.walter.demo02;

import java.util.HashMap;
import java.util.Map;

/*
 * 使用HashMap集合，存储自定义的对象
 * 自定义对象，作为键，出现，作为值出现
 */
public class HashMapDemo {
	public static void main(String[] args) {
		function_1();
	}
	/*
	 * HashMap 存储自定义对象Person,作为键出现
	 * 键的对象，是Person类型，值是字符串
	 * 保证键的唯一性，存储到键的对象，重写hashCode equals
	 */
	private static void function_1() {
		HashMap<Person,String> map = new HashMap<Person,String>();
		//保证唯一性重写equals和hashCode
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
	 * Hash 存储自定义的对象Person，作为值出现
	 * 键的对象，是字符串，可以保证唯一性
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
