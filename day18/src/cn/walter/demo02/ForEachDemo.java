package cn.walter.demo02;
import java.util.ArrayList;
import java.util.Collection;

/*
 * JDK1.5�����ԣ���ǿforѭ��
 * JDK1.5�汾�󣬳����µĵĽӿ� java.lang.Iterable
 * 	Collection��ʼ�̳�Iterable
 * 	Iterable���ã�ʵ������ӿ���������Ϊ "foreach" ����Ŀ�ꡣ 
 * 
 * ��ʽ��
 *  for( ��������  ������ : ������߼���){
 *  	sop(����);
 *  }
 */
import cn.walter.demo01.Person;//��ͬ����Ҫ����
public class ForEachDemo {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 * ��ǿforѭ����������
	 * �洢�Զ���Person����
	 */
	
	private static void function_2() {
		ArrayList<Person> Array = new ArrayList<Person>();
		//����Person��������
		Array.add(new Person("sa",21));
		Array.add(new Person("as",34));
		Array.add(new Person("fg",89));
		for(Person p : Array){
			System.out.println(p);
		}
	}

	private static void function_1() {
		//for���ڶ������������ʱ���ܷ���ö���ķ����� ����
		String[] str = {"ds","sd","sds"};
		for(String s: str){
			System.out.println(s.length());
		}
	}
	/*
	 * ʵ��forѭ������������
	 * �ô�:�������ˣ��������������
	 * �׶ˣ�û�����������ܲ������������Ԫ�أ��������򣬲��ҵ� 
	 */
	private static void function() {
		int[] arr = {1,2,4,54,5,56};
		for(int i : arr){
			System.out.println(i);
		}
		
	}
}
