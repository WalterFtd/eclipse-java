package cn.walter.demo03;
/*
 * ���з��е���
 *  (�õ�ʱ���Eд����->����д����)
 * 	��ArrayList<E> �ġ�<E>��������ν�ķ���
 *  E:Element Ԫ�أ�ʵ��˼�����һ������
 *  ArrayList<Integer>,E ���ܵ��Լ�д�����ͣ�����Integer����
 * 	public class ArrayList<E>{
 * 
 * 		public boolean add(E e) {  //�����еķ�������������
 * 			elementData[size++] = e;//�������������e
 * 		}
 * 	}
 */
import java.util.ArrayList;
public class GenericDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		//arrayList���� ,�Լ��з���
		//<T> T[] toArray(T[] a) 
		Integer[] i = new Integer[array.size()];
		array.toArray(i); //�����ͷ���
		for(Integer k : i){
			System.out.println(k);
		}
	}
}

