package cn.walter.demo01;

public class ArrayTools {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int i = getArray(arr);//main接受了这个异常，main也没有对数组越界异常进行处理，抛给main的调用者JVM
		//JVM收到异常后，做了两件事情          1.将异常信息，以红色字体输出给控制台 （位置，信息）  2.停止结束程序
		System.out.println(i);
	}

	private static int getArray(int[] arr) {
		/*
		 * arr[3]没有这个索引，JVM能够检测到出现数组的越界问题
		 * JVM：
		 * 1.创建了异常的对象 new ArrayIndexOutOfBoundsException(3)
		 * 2.在getArray中找，有没有程序可以处理异常，找不到
		 * 3.将异常的对象进行抛出，抛给方法的调用者
		 * 注意：一旦异常被抛出了，后面的程序就不再执行
		 */
		int i = arr[3];
		return i+1;
	}
	
}
