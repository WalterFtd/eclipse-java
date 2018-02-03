package cn.walter.demo02;

public class SystemDemo {
	public static void main(String[] args) {
		function_4();
	}
	/* System方法    从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
	 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
	 * Object src, 要复制的源数组
	 * int srcPos, 数组源的起始索引
	 * Object dest, 复制后的目标数组
	 * int destPos, 目标数组起始索引
	 * int length, 复制几个
	 */
	public static void function_4(){
		//native表示本地，调用windows的功能去完成数组复制，本地方法对于我们都是保密的，不开源的，调用操作系统完成功能
		//运行时走到内存叫本地方法栈
		int[] src = {11,22,33,44,55};
		int[] desc = {77,88,99,66};
		System.arraycopy(src, 1, desc, 1, 2);
		for(int i = 0;i<desc.length;i++){
			System.out.println(desc[i]);
		}
	}
	/*
	 * 获取当前操作系统的属性
	 * static Properties getProperties()
	 * 方法的返回值Properties是一个集合里面的一个类，和ArrayList差不多
	 */
	public static void function_3(){
		System.out.println(System.getProperties());
	}
	/*
	 * JVM在内存中，收取对象的垃圾
	 * static void gc()
	 */
	public static void function_2(){
		//匿名对象,一次性用完就丢
		new Person();
		new Person();
		new Person();
		//虚拟机收垃圾时会调用类中的方法finalize
		System.gc();
	}
	/*
	 * 退出虚拟机，所用程序终止
	 * static void exit(0);根据惯例，非 0 的状态码表示异常终止。
	 */
	public static void function_1(){
		while(true){
			System.out.println("hello");
			System.exit(0);
		}
	}
	/*
	 * 获取系统当前的毫秒值
	 * start long currentTimeMillis()
	 * 对程序执行时间测试
	 */
	public static void function(){
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
