package cn.walter.hotel;
/*
 * 定义服务员类
 * 属于员工的一种，具有额外服务功能
 * 继承Employee，实现VIP接口
 */
public class FuWuYuan extends Employee implements VIP{
	//空参数构造方法
	public FuWuYuan() {}
	//满参数构造方法，直接super给父类即可，让父类来构造
	public FuWuYuan(String name, String id) {
		super(name, id);
	}
	//抽象方法重写
	public void work(){
		System.out.println("服务员在端盘子");
	}
	public void services(){
		System.out.println("服务员端盘子加倍");
	}
}
