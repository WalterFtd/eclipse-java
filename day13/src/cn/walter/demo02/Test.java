package cn.walter.demo02;
/*
 * final 固定值的定义方式
 */
public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
		z.show();
		
		final int i = 10;//被final修饰，一次赋值，终身不变，常量
		System.out.println(i);
		
		//final修饰应用变量问题
		//变量，保存内存地址，终身不变
		final Zi z2 = new Zi();
		System.out.println(z2);
		//zi =null;
	}
}
