package cn.walter.demo02;
import java.util.ArrayList;
import java.util.Collection;

/*
 * JDK1.5新特性，增强for循环
 * JDK1.5版本后，出现新的的接口 java.lang.Iterable
 * 	Collection开始继承Iterable
 * 	Iterable作用，实现这个接口允许对象成为 "foreach" 语句的目标。 
 * 
 * 格式：
 *  for( 数据类型  变量名 : 数组或者集合){
 *  	sop(变量);
 *  }
 */
import cn.walter.demo01.Person;//不同包需要导入
public class ForEachDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * 增强for循环遍历集合
	 * 存储自定义Person类型
	 */
	
	private static void function_2() {
		ArrayList<Person> Array = new ArrayList<Person>();
		//创建Person匿名对象
		Array.add(new Person("sa",21));
		Array.add(new Person("as",34));
		Array.add(new Person("fg",89));
		for(Person p : Array){
			System.out.println(p);
		}
	}

	private static void function_1() {
		//for对于对象数组遍历的时候，能否调用对象的方法呢 可以
		String[] str = {"ds","sd","sds"};
		for(String s: str){
			System.out.println(s.length());
		}
	}
	/*
	 * 实现for循环，遍历数组
	 * 好处:代码少了，方便对容器遍历
	 * 弊端：没有索引，不能操作容器里面的元素，不能排序，查找等 
	 */
	private static void function() {
		int[] arr = {1,2,4,54,5,56};
		for(int i : arr){
			System.out.println(i);
		}
		
	}
}
