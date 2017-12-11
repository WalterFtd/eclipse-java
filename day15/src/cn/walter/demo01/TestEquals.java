package cn.walter.demo01;

public class TestEquals {
	public static void main(String[] args) {
		//person类继承Object类，继承下来了父类的方法equals
		Person p1 = new Person("李四",21);
		Person p2 = new Person("张三",23);
		
		//Person对象p1，调用父类的方法equals，进行对象的比较
		boolean b = p1.equals(p2);
		System.out.println(b);
		
	}
}
