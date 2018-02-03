package cn.walter.demo05;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bigDecimalDemo {
	public static void main(String[] args) {
		/*
		 * 计算结果未知
		 * 原因:计算机二进制中，表示浮点数不精确造成
		 * 超过大型的浮点数据，提供高精度的浮点运算 BigDecimal
		 * 用法和BigInteger相似
		 */
		System.out.println(0.09+0.01);//0.09999999999999999
		System.out.println(1.0-0.32);//0.6799999999999999
		System.out.println(1.015*100);//101.49999999999999
		System.out.println(1.301/100);//0.013009999999999999
		
		BigDecimal a = new BigDecimal("12.3456789034");
		BigDecimal b = new BigDecimal("12.34567890341");
		//计算和b1+b2  调用方法Add
		BigDecimal c = b.add(a);
		//计算差b1-b2  调用方法subtract
		 BigDecimal d = b.subtract(a);
		 //计算乘积 multiply
		BigDecimal e = b.multiply(a);
		//计算商
		//divide(BigDecimal divisor, int scale, int roundingMode) 
		//int scale 保留几位小数
		//int roundingMode 保留模式 阅读API文档
		//BigDecimal.ROUND_UP  静态常量
		
		BigDecimal f = b.divide(a,2,BigDecimal.ROUND_UP);//如果出现了除不尽的情况
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
