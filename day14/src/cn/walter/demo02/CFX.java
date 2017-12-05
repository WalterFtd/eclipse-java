package cn.walter.demo02;
/*
 * 定义长方形类
 * 	计算面积，周长
 *
 * 边长，设计的时候，定义为成员变量，两个计算方法的局部变量
 * 属于谁的？属于长方形事物，还是每个独立计算的功能
 * 
 * 结论：如果变量是该类的一部分，定义为成员变量，如只是功能的一部分，则为形参变量
 */
public class CFX {
	private int w;
	private int h;
	
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	//构造方法
	public CFX(int w, int h) {
		this.w = w;
		this.h = h;
	}
	//求长方形面积
	public int getArea(){
		return w*h;
	}
	//求长方形周长
	public int getLong(){
		return (w+h)*2;
	}
	
	
}

