package cn.walter.demo02;
/*
 * final �̶�ֵ�Ķ��巽ʽ
 */
public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.function();
		z.show();
		
		final int i = 10;//��final���Σ�һ�θ�ֵ�������䣬����
		System.out.println(i);
		
		//final����Ӧ�ñ�������
		//�����������ڴ��ַ��������
		final Zi z2 = new Zi();
		System.out.println(z2);
		//zi =null;
	}
}
