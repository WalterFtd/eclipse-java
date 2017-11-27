package cn.walter.demo08;
/*
 * 测试员工类
 * 	创建最下面的子类的对象
 */
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		Network net = new Network();
		
		ee.setName("小明");
		ee.setId("201");
		
		net.setName("小红");
		net.setId("301");
		
		System.out.println(ee.getName());
		System.out.println(net.getName());
		ee.work();
		net.work();
		
	}
}
