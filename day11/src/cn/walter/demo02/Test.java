package cn.walter.demo02;

public class Test {
	public static void main(String[] args) {
		//ʹ�ýӿ��ж���ĳ���
		//��������̬���Σ����Ա�����ֱ�ӵ��ã����ӿڵ�����ֱ�ӵ���
		System.out.println(MyInter.x);
		MyInterImpl my = new MyInterImpl();
		my.show();
		int a = my.getSum(2, 3);
		System.out.println(a);
	}
}
