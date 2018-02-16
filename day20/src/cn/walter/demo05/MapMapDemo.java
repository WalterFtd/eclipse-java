package cn.walter.demo05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的嵌套，Map中存储的还是Map集合
 * 学校
 *   基础
 *   001 a
 *   002 b
 *   提高
 *   001 c
 *   002 d
 * 对于数据进行对象存储
 * 基础：存储学号和姓名的键值对
 * 学校：存储的班级
 * 
 * 基础班Map:<学号，姓名>
 * 学校Map<班级名称，基础班Map>
 */
public class MapMapDemo {
	public static void main(String[] args) {
		//定义班级集合
		HashMap<String,String> jc = new HashMap<String,String>();
		HashMap<String,String> tg = new HashMap<String,String>();
		//添加数据
		jc.put("001", "a");
		jc.put("002", "b");
		tg.put("001", "c");
		tg.put("002", "d");
		//定义学校容器，键是班名，值是班级容器
		HashMap<String,HashMap<String,String>> xx = 
				new HashMap<String,HashMap<String,String>>();
		xx.put("jc", jc);
		xx.put("tg", tg);	
		//keySet(xx);
		entrySet(xx);
	}
	/*
	 * 利用entrySet方法便利
	 */
	public static void entrySet(HashMap<String,HashMap<String,String>> xx){
		//调用xx集合方法entrySet方法，将xx集合的键值关系对象，存储到Set集合
		Set<Map.Entry<String, HashMap<String,String>>>  classNameSet = xx.entrySet();
		//迭代器迭代Set集合
		Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = 
				classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next方法，取出的是xx集合的键值对应关系对象
			Map.Entry<String, HashMap<String,String>> classNameEntry = classNameIt.next();
			//classNameEntry方法，getKey()，getValue()
			String classNameKey = classNameEntry.getKey();
			//获取值是一个Map集合
			HashMap<String,String> classMap = classNameEntry.getValue();
			//调用班级集合classMap方法entrySet，键值对关系对象存储Set集合
			Set<Map.Entry<String,String>> StudentSet = classMap.entrySet();
			//迭代Set集合
			Iterator<Map.Entry<String,String>> studentIt = StudentSet.iterator();
			while(studentIt.hasNext()){
				//StudentIt方法next获取的是班级集合的键值对关系对象
				Map.Entry<String, String>studentEntry = studentIt.next();
				//classEntry方法getKey()，getValue()
				String numKey = studentEntry.getKey();
				String nameValue = studentEntry.getValue();
				System.out.println(classNameKey+"..."+numKey+"..."+nameValue );
			}
		}
	}
	/*
	 * 利用keySet方法遍历
	 */
	public static void keySet(HashMap<String,HashMap<String,String>> xx){
		//调用xx集合方法keySet将键存储到Set集合
		Set<String> classNameSet = xx.keySet(); 
		//迭代Set集合
		Iterator<String> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next获取出来的是Set集合元素，xx集合的键
			String classNameKey = classNameIt.next();
			//xx集合的方法get获取值，值是一个HasnMap集合
			HashMap<String,String> classMap = xx.get(classNameKey);
			//调用classMap集合方法keySet，键存储到Set集合
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
			while(studentIt.hasNext()){
				//stydentIt.next获取出来的是classMap的键，学号
				String numKey = studentIt.next();
				//调用classMap集合中的get方法获取值
				String numValue = classMap.get(numKey);
				System.out.println(classNameKey+"..."+numKey+"..."+numValue);
			}
		}
	}
}
