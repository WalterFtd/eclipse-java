package cn.walter.demo;
/*
 * 调用自己生成的jar包使用求平均数函数
 */
import cn.walter.sum.GetAvg;

public class Test {
	public static void main(String[] args) {
		double d = GetAvg.getAvg(1.23, 7.6);
		System.out.println(d);
	}
}
