package cn.walter.demo08;
/*
 * 测试员工案例
 * 
 * 小知识：
 * super.成员变量;调用父类的成员变量
 * super.(参数);调用父类的构造方法
 * super.成员方法();调用父类的成员方法
 */
public class Test {
	public static void main(String[] args) {
		//创建EE对象，调用方法
		JavaEE j = new JavaEE("小王", "j001");
		j.work();
		//创建net对象，调用方法
		Net n = new Net("小李", "n001");
		n.work();
	}
}
