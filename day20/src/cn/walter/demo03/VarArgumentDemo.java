package cn.walter.demo03;
/*
 * JDK1.5�µ����ԣ������Ŀɱ����
 * ǰ�᣺����������������ȷ���������ĸ�������
 * �ɱ�����﷨����������...������
 * �ɱ���������ʾ���һ������
 */
public class VarArgumentDemo {
	public static void main(String[] args) {
		//����һ�����пɱ�����ķ��������ݲ�������������
		int sum = getsum(2,4,5,6,7);
		System.out.println(sum);
	}
	/*
	 * �ɱ������ע������
	 * 1.һ�������У��ɱ����ֻ��һ��
	 * 2.�ɱ����������д�ڲ����б�����һλ
	 */
	public static void function(int a,int b,int...c){
		
	}
	/*
	 * ���巽����������������
	 * �����Ŀɱ����ʵ��
	 */
	public static int getsum(int...a){
		int sum = 0;
		for(int i :a){
			sum =sum+i;
			
		}
		System.out.println(a.length);
		return sum;
	}
}
