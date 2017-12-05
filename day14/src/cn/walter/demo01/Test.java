package cn.walter.demo01;
/*
 * 选中调用的方法，按f3或者   ctrl按住鼠标移动到方法上就可以转到方法的定义
 * 注意：多态调用的话，或直接到父类的方法里，因为，编译看父类
 * 
 * JDK
 * 	JRE
 * 		JVM
 *		运行时所需要的核心类库
 * 	开发工具
 * 
 *所以运行时很多类共同运行的结果，String，system等内部的核心类同时在运行
 *java.lang包默认已经导入,直接用，rt.jar装的都是核心类库的class文件
 */
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		ee.work();
	}
}
