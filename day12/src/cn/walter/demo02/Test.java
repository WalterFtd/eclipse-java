package cn.walter.demo02;

public class Test {
	public static void main(String[] args) {
		//����Person��Ķ���
		//�����ڵ������Ĺ��췽��
		
		//1.���ÿղ����Ĺ��췽������������
		Person p1 = new Person();
		p1.setName("Сǿ");
		p1.setAge(10);
		System.out.println(p1.getName()+"����"+p1.getAge());
		//����2�������Ĺ��췽������������
		Person p2 = new Person("ǿ����",5);
		
		System.out.println(p2.getName()+"����"+p2.getAge());
	}
}
