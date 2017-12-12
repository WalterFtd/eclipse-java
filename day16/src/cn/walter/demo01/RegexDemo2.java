package cn.walter.demo01;
/*
 * " +":匹配多个空格
 * \\.+:匹配多点
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		//split1();
		replaceAll();
	}
	/*
	 * 将所有数字替换
	 * String类方法replaceAll(正则规则，替换后的新字符串)
	 */
	public static void replaceAll(){
		String str = "sdsdsdsdsdsd122323";
		str = str.replaceAll("[\\d]+","#");
		System.out.println(str);
	}
	/*
	 * String类方法split对字符串进行切割
	 * 12-25-36-98按照-字符串进行切割
	 */
	public static void split1(){
		String str = "12-25-36-98";
		//按照-对字符串进行切割，String类方法split
		String[] strArr = str.split("-");
		System.out.println("数组的长度"+strArr.length);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
