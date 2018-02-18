package cn.walter.demo04;

public class ExceptionDemo {
	public static void main(String[] args) {
		int avg = getAVG(50,-60,70,80);
		System.out.println(avg);

	}
	/*
	 *���ݳɼ�������ɼ���ƽ���� 
	 *�ɼ�û�и�������Ҫ�׳��쳣��ֹͣ����
	 */
	public static int getAVG(int...source){
		int sum = 0;
		for(int s :source){
			if(s<0){
				throw new FuShuException("�ɼ�����"+s);
			}
			sum = sum +s ;
		}
		return sum/source.length;
	}
	
}
