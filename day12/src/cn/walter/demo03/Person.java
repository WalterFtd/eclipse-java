package cn.walter.demo03;
/*
 * this�����ڹ��췽��֮����е���
 * this.�ķ�ʽ�����־ֲ������ͳ�Ա����ͬ�����
 * this�ڹ��췽��֮��ĵ��ã��﷨this()
 */
public class Person {
	private String name;
	private int age;

	public Person(){
		//�ѹ������������������Ĺ�����ȥ��ֵ
		//�������ģ�20���ݸ��˱���name��age
		//this()������ڵ�һλ
		//�ô������ٴ����д��
		this("����",20);
	}

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
