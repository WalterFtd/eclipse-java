package cn.walter.demo05;

/*
 * �������ˣ�
 * ���ԣ�����������
 * ������˵��
 * 
 * ˽�л����е����ԣ���Ա������������д��Ӧ��get/set����
 * �����Զ�����࣬�Զ����Ա������Ӧ��˽�л����ṩget/set
 * 
 * this,���ֳ�Ա�����;ֲ�������ͬ������
 * �����У����ʳ�Ա������дthis
 * this:����Ķ�������
 */
public class Person {
	private String name;
	private int age;
	//set����������name��age��ֵ
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//get����������name��age��ȡֵ
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void speak() {
		String name ="fdf";
		int age = 25;
		System.out.println("����˵�� "+this.name + "....." +this.age);
	}
}
