package cn.walter.demo12;

public class Test {
	public static void main(String[] args) {
		//{}局部代码块，限制了a变量的作用域
		{
			int a = 1;
			System.out.println(a);
		}
		//System.out.println(a);
		
		new Person("张三",20);
		new Person("张三2",202);
	}
}
