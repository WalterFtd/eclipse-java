package cn.walter.demo03;

/*
 * 对象的Hash值，普通的十进制整数
 * 父类Object，方法public int hashCode() 计算结果int整数
 */
public class HashDemo {
	public static void main(String[] args) {
		Person p = new Person();
		//结果不可预知,对象的hash值
		int i = p.hashCode();
		System.out.println(i);
		
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
