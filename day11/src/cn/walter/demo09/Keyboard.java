package cn.walter.demo09;
/*
 * 自定义的键盘类
 * 满足USB接口规范
 * 实现USB接口，重写抽象方法
 */
public class Keyboard implements USB {
	public void open() {
		System.out.println("开启键盘");
	}

	public void close() {
		System.out.println("关闭键盘");
	}

}
