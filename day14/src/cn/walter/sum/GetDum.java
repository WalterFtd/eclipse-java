package cn.walter.sum;
/*
 * 类中，定义方法，实现两个整数的求和，获取求和的结果
 * 这个类的方法，是提供给别人使用的
 * 写一份使用说明书,文档说明书
 * 在eclipse里提取出注释文档，选中包/类，export-java-javadoc，就可以得到注释的网页
 * 
 * 把许多class变成一个压缩包jar，选中包/类，export-JAR file，确定路径即可
 * 给用户就一个文档，加一个jar包即可
 */
/**
 * 类GetSum实现整数求和
 * @author Walter
 * @version 1.0
 *
 */
public class GetDum {
	/**
	 * 方法getSum功能计算两个整数的求和
	 * 调用此方法传递两个int整数，返回求和值
	 * @param a
	 * @param b
	 * @return sum
	 */
	//因为没有使用成员变量，让别人可以直接使用类名来调用，所以加上static
	public static int getSum(int a, int b){
		return a+b;
	}
}
