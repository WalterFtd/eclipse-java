package cn.walter.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合获取方式
 * entrySet方法，，键值对应映射关系获取
 * 实现步骤：
 * 	1.调用map集合方法entrySet()将集合中的映射关系对象，存储到Set集合中
 * 		set<Entry<K,V>>
 * 	2.迭代Set集合
 * 	3.获取出的Set集合的元素，是映射关系对象
 * 	4.通过映射关系对象方法getKey getValue 获取键值对
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "wqa");
		map.put(2, "sd");
		map.put(3, "fdf");
		//调用map集合方法entrySet将集合中的映射关系对象，存储到Set集合
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		Iterator<Map.Entry <Integer,String>> it = set.iterator();
		while(it.hasNext()){
			//3.获取出的Set集合的元素，是映射关系对象
			//it.next 获取的是Map.Entry对象
			Map.Entry <Integer,String> entry = it.next();
			//4.通过映射关系对象方法 getKey(),getValue()获取键值对
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
