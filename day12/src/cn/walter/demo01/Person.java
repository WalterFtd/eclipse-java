package cn.walter.demo01;
/*
 * �Զ����Person�࣬��Ա������name age
 * Ҫ����new Person��ͬʱ����ָ����name��age��ֵ
 * ʵ�ֹ��ܣ����÷���ȥʵ�֣����췽���������� Constructor
 * ���ã���new ��ͬʱ�Գ�Ա������ֵ������������Գ�ʼ����ֵ��new Person��������name��age��ֵ
 *
 *	���췽���Ķ����ʽ
 *		Ȩ�� ������ �������б�{
 *		}
 *		���������֣���������������ȫһ��
 *		���췽��������д����ֵ���ͣ�void Ҳ����д
 *
 *		���췽����ʲôʱ�������أ���new ��ʱ���Զ�ִ��
 *		ֻ����һ��
 *
 *	ÿ��class����ӵ�й��췽�������췽����дҲ��
 *	�����ʱ��javac�����Զ���������Ƿ��й��췽��
 *	����У��Ͳ����
 *	���û�У��������ͻ��Զ����һ�����췽����public Person(){}
 *	
 */
public class Person {
	private String name;
	private int age;
	
	//����Person��Ĺ��췽��
	public Person(String name,int age){
//		System.out.println("����һ���ղ����Ĺ��췽��");
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
