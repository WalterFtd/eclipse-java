package cn.walter.demo12;
/*
 * ��̬����飬ִֻ��һ��
 * �������飬newһ�Σ���ִ��һ�Σ����ڹ��췽��
 * ���췽����new һ�Σ���ִ��һ��
 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("���ǹ��췽��");
	}
	//��������
	{
		System.out.println("���ǹ�������");
	}
	
	//��̬����飬����ִ��
	static{
		System.out.println("���Ǿ�̬�����");
	}
}
