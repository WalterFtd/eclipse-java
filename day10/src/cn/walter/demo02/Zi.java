package cn.walter.demo02;

public class Zi extends Fu {
	int i = 2;
	public void show(){
		int i = 3;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
