package cn.walter.demo04;

import java.util.Arrays;

/*
 * ����Ĺ����࣬��������Ĳ���
 * java.util.Arrays
 */
public class ArraysDemo {
	public static void main(String[] args) {
		//function_3();
		int[] arr ={11,34,56,78,213,67,34};
		int[] newArray = test(arr);
		System.out.println(Arrays.toString(newArray));
	}
	private static int[] test(int[] arr) {
		//�������������
		Arrays.sort(arr);
		//�������������Ԫ�طŵ���һ��������
		int[] result = new int[3];
		//�ɼ��������λԪ�طŵ����������
		//System.arraycopy(arr, 0, result, 0, 3);
		for(int i = 0;i < 3;i++){
			result[i] = arr[i];
		}
		return result;
	}
	/*
	 * static String toString(����)
	 * ���������ַ���
	 */
	private static void function_3() {
		 int[] arr = {1,2,3,5,8,9,10};
		 String s = Arrays.toString(arr);
		 System.out.println(s);
	}
	/*
	 * static int binarySearch(���飬�����ҵ�Ԫ��)
	 * ����Ķ���������
	 * ����Ԫ���������г��ֵ�����
	 * Ԫ�ز����ڣ����ص���-�������-1��
	 */
	public static void function_2(){
		 int[] arr = {1,2,3,5,8,9,10};
		 int index = Arrays.binarySearch(arr,-4);
		 System.out.println(index);
		 
	}
	
	/*
	 * static void sort(����)
	 * ��������������
	 */
	public static void function(){
		int[] arr = {12,334,56,23};
		Arrays.sort(arr);//��������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
