package cn.walter.demo05;
/*
 * �����ֵĶ����������ͱ��������Է���ʹ��
 * ��������û�����ñ�����ֻ��ʹ��һ��
 * 
 * ����������Ե�����������
 * ����������Ե�����ֵ
 */
public class Test {
	public static void main(String[] args) {
		//ʹ�ö��
		Person p = new Person();
		p.eat();
		//ʹ��һ��
		new Person().eat();
		//������
		method(new Person());
		//������ֵ
		Person p1 = method();
		p1.eat();
		
	}
	public static void method(Person p){
		p.eat();
	}
	//���������أ�������������
	//�����ķ���ֵ��Person����
	//����return��䣬���ص��������Ķ���
	public static Person method(){
		return new Person();
	}
}
