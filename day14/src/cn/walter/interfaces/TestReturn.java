package cn.walter.interfaces;

public class TestReturn {
	public static void main(String[] args) {
		//����GetSmoking��ķ���getSmoking��ȡSmoking�ӿڵ�ʵ�������
		GetSmoking g = new GetSmoking();
		//������ִ�н���ǽӿڵ�ʵ�������new student();
		Smoking s = g.getSmoking();
		s.smoking();
	}
}
