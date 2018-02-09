package cn.walter.demo03;
/*
 * 带有泛行的类
 *  (用的时候给E写类型->必须写类型)
 * 	例ArrayList<E> 的“<E>”就是所谓的泛型
 *  E:Element 元素，实际思想就是一个变量
 *  ArrayList<Integer>,E 接受到自己写的类型，就是Integer类型
 * 	public class ArrayList<E>{
 * 
 * 		public boolean add(E e) {  //带泛行的方法，跟着类走
 * 			elementData[size++] = e;//数组的索引等于e
 * 		}
 * 	}
 */
import java.util.ArrayList;
public class GenericDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		//arrayList集合 ,自己有方法
		//<T> T[] toArray(T[] a) 
		Integer[] i = new Integer[array.size()];
		array.toArray(i); //带泛型方法
		for(Integer k : i){
			System.out.println(k);
		}
	}
}

