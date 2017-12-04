package cn.walter.demo07;
/*
 * 内部类中同名成员变量的调用
 * 
 */
public class Outer {
	int i = 1;
	class Inner{
		int i = 2;
		public void inner(){
			int i = 3;
			System.out.println(i);
			System.out.println(this.i);
			System.out.println(Outer.this.i);
		}
	}
}
