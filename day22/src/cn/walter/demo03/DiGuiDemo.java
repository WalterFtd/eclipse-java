package cn.walter.demo03;
/*
 * �����ĵݹ�
 * 	�����Լ������Լ�
 * �ʺ���,��������������岻��,�������е�ʱ��,�������еķ���������仯
 * ע��:
 *     �ݹ�һ��Ҫ�г���, ��������ó���ͣ��
 *     �ݹ�������ܹ���
 *     ���췽��,��ֹ�ݹ�
 * 
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		int sum = getSum(100);
		System.out.println(sum);
		System.out.println(getJieCheng(10));//��׳�
		System.out.println(getFBNQ(12));
	}
	/*
	 *  �����ݹ�,����쳲���������
	 * 	�ӵ����ʼ������ÿ��Ŀ����ǰ������ĺ�
	 * 	n=n-1+n-2
	 *  n>2
	 */
	public static int getFBNQ(int mouth){
		if(mouth == 1)
			return 1;
		if(mouth == 2)
			return 1;
		return getFBNQ(mouth-1)+getFBNQ(mouth-2);
	}
	
	/* 
	 *  ����׳� 5!
	 *   5*4*3*2*1
	 */
	public static int getJieCheng(int n){
		if(n == 1){
			return 1;
		}
		return n*getJieCheng(n-1);

	}
	/*
	 *  ���� 1+2+3+100�� = 5050
	 *  �������:
	 *    n+(n-1)+(n-2)
	 *    100+(100-1)+(99-1)+...1
	 */
	public static int getSum(int n){
		if(n == 1){
			return 1;
		}
		return n+getSum(n-1);
	}
	
}
