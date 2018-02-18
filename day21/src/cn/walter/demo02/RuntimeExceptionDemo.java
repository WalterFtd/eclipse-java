package cn.walter.demo02;
/*
 * �쳣��Ϊ�����쳣������ʱ�쳣
 * 	�����쳣���������׳��쳣�ķ��������������ʧ��(try   throws)
 * 	�����쳣���׳����쳣ʱRuntimeException�࣬��������������
 * 
 * �����쳣���ص㣺
 * 		�׳���������ʱ�쳣  new  XXXException
 * 		������������,����Ҫthrows���,�����ߣ�����Ҫ����
 * 		���ԭ��
 * 			�����쳣ԭ�����ᷢ������������ˣ�������Աֹͣ�����޸�Դ����
 * 			�����쳣һ����������������û��������
 * 			
 * 		
 */
public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		//function();
		double d = getArea(-1);
		System.out.println(d);
	}
	/*
	 * ���巽��������Բ�����
	 * ���ݲ���0�����߸����������ʱ������
	 * ����Υ������ʵ���
	 * ����С��0��ֹͣ���򣬲�Ҫ�ټ�����
	 * 
	 */
	public static double getArea(int r){
		if(r < 0)
			throw new RuntimeException("Բ�β�����");
		return r*r*Math.PI;
	}
	private static void function() {
		int[] arr = {1,2,3};
		//�������5���������жϣ����5��������100����5�����ϵ�����/2.����/3
		if(arr[5] > 100){
			arr[5] = arr[5]/2;
		}else{
			arr[5] = arr[5]/3;
		}
		throw new RuntimeException();
	}
}
