package cn.walter.demo02;
/*
 * String类的其他功能
 */
public class StringDemo5 {
	public static void main(String[] args) {
		function4();
	}
	/*
	 * String trim 去掉字符串两端空格
	 */
	public static void function(){
		String s1 = " abc cd ";
		String s2 = s1.trim();
		System.out.println(s1);
		System.out.println(s2);
	}
	/*
	 * String replace(char oldChar,char newChar)
	 * 将字符串中的老字符，替换为新字符
	 * 
	 * String replace(String old,char newstr)
	 * 将字符串中的老字符串，替换为新字符串
	 */
	public static void function2(){
		String s1 = "scjbscjs".replace('s', 'w');
		System.out.println(s1);
		String s2 = "rtrtrtrtyu".replace("rt", "yu");
		System.out.println(s2);
		
	}
	/*
	 * String toLowerCase() 字符串转成小写
	 * String toUpperCase() 字符串转成大写
	 */
	public static void function3(){
		String s1 = "scjbscjs".toUpperCase();
		System.out.println(s1);
		String s2 = "CSSCSCSCS".toLowerCase();
		System.out.println(s2);
	}
	/*
	 * char charAT(int index)
	 * 返回索引上的字符
	 */
	public static void function4(){
		char ch = "abcde".charAt(3);
		System.out.println(ch);
	}
}
