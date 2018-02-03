package cn.walter.demo04;

import java.util.Arrays;

/*
 * 数组的工具类，包含数组的操作
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
		//对数组进行排序
		Arrays.sort(arr);
		//将最后三个数组元素放到另一个数组中
		int[] result = new int[3];
		//成绩的最后三位元素放到结果数组中
		//System.arraycopy(arr, 0, result, 0, 3);
		for(int i = 0;i < 3;i++){
			result[i] = arr[i];
		}
		return result;
	}
	/*
	 * static String toString(数组)
	 * 将数组变成字符串
	 */
	private static void function_3() {
		 int[] arr = {1,2,3,5,8,9,10};
		 String s = Arrays.toString(arr);
		 System.out.println(s);
	}
	/*
	 * static int binarySearch(数组，被查找的元素)
	 * 数组的二分搜索法
	 * 返回元素在数组中出现的索引
	 * 元素不存在，返回的是-（插入点-1）
	 */
	public static void function_2(){
		 int[] arr = {1,2,3,5,8,9,10};
		 int index = Arrays.binarySearch(arr,-4);
		 System.out.println(index);
		 
	}
	
	/*
	 * static void sort(数组)
	 * 对数组升序排列
	 */
	public static void function(){
		int[] arr = {12,334,56,23};
		Arrays.sort(arr);//快速排序
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
