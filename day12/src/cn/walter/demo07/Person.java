package cn.walter.demo07;
/*
 * Student���Worker������ͬ��Ա������name age
 * �̳е�˼�룬���Գ�ȡ���γɸ���
 * ��Ա������˽������
 * ͬʱ��Ҫ�ڴ���ѧ���͹��˶���ʱ�ͱ�����ȷ����������
 * new Student ��new Worker ������������ȷ��
 */
public class Person {
	private String name;
	private int age;
	//������˽�е�
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
