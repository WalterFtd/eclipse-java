package cn.walter.demo05;
/*
 * ��̬�ĵ��÷�����Զ�����������д
 */
public class Test {
	public static void main(String[] args) {
		//Java�У�����Ķ�̬�ԣ����ó����еķ���
		//��ʽ���������ͻ����ǽӿ�����  ���� = new ����Ķ���
		Fu z = new Zi();
		z.show();
		
		//������Animal��������Cat
		Animal a = new Cat();
		a.eat();
		
		Smoking sk = new Student();
		sk.smoking();
	}
}
