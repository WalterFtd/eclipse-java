package cn.walter.demo01;

public class TestEquals {
	public static void main(String[] args) {
		//person��̳�Object�࣬�̳������˸���ķ���equals
		Person p1 = new Person("����",21);
		Person p2 = new Person("����",23);
		
		//Person����p1�����ø���ķ���equals�����ж���ıȽ�
		boolean b = p1.equals(p2);
		System.out.println(b);
		
	}
}
