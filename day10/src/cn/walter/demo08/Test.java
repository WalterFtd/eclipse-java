package cn.walter.demo08;
/*
 * ����Ա����
 * 	���������������Ķ���
 */
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		Network net = new Network();
		
		ee.setName("С��");
		ee.setId("201");
		
		net.setName("С��");
		net.setId("301");
		
		System.out.println(ee.getName());
		System.out.println(net.getName());
		ee.work();
		net.work();
		
	}
}
