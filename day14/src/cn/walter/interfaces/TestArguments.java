package cn.walter.interfaces;

public class TestArguments {
	public static void main(String[] args) {
		//����nosmoking������ʵ�������
		//ʵ����Ķ������Լ��Ķ���
		Student s = new Student();
		noSmoking(s);
		
		noSmoking(new Student());
		//ʵ����Ķ����ǲ��ö�̬����������
		Smoking s1 = new Student();
		noSmoking(s1);
	}
	/*
	 * ���巽���������������ӿ�����
	 * �����Ĳ�����Smoking�Ľӿ�����
	 * ���÷��������봫�ݽӿڵ�ʵ����Ķ���
	 */
	public static void noSmoking(Smoking s){
		//���ýӿ��еĳ�������̬��ֱ���ýӿ�������
		System.out.println(Smoking.A);
		//�ӿڵ����ñ���s�����÷���
		s.smoking();
	}
}
