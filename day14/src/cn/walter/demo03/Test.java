package cn.walter.demo03;

import java.util.Calendar;

public class Test {
	//ֱ�ӵ��ó�����ľ�̬����getInstance��ȡ�����������Ķ���
	//������ľ�̬�������������Լ����������
	//���ڵ�������˵������Ҫ��ע������˭
	public static void main(String[] args) {
		Animal a = Animal.getInstance();
		a.eat();
		//������
		Calendar c = Calendar.getInstance();
		System.out.println(c);
	}
}
