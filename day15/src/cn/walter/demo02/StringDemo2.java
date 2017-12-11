package cn.walter.demo02;

public class StringDemo2 {
	public static void main(String[] args) {
		//字符串定义方式2个，直接= 使用String类的构造方法
		String str1 = new String("adad");//双层赋值
		String str2 = "adad";
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);//引用数据类型，比较对象的地址 false
		System.out.println(str1.equals(str2)); //在子类中重写了equals方法，一个个字符比较，所以为true
	}
}
