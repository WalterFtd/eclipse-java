package cn.walter.demo03;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "����";
		//p2.name = "����";
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		//���������ľ�̬����
		p1.className = "������";
		System.out.println(p2.className);
		
		System.out.println(Person.className);
	}
	
}
