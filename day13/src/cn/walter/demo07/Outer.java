package cn.walter.demo07;
/*
 * �ڲ�����ͬ����Ա�����ĵ���
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
