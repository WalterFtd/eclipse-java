package cn.walter.demo01;
/*
 * �쳣�еĹؼ���
 * 	throw���ڷ����ڲ����׳��쳣�Ķ���
 * 	throw ���棬����дnew ���󣬱������쳣�Ķ��󣬱�����Exception��������  ֻ���쳣������
 * 
 * �����������쳣�ؼ���
 * 	throws �����ڷ����������ϣ������˷��������ܳ������쳣
 * 	������ߴ���
 * 	throws �������д�쳣�������
 * 
 * 	������һ���׳��쳣�ķ����������߾ͱ��봦��
 *  �������ͱ���ʧ��
 */
public class ExceptionDemo {
	public static void main(String[] args)throws Exception {
		int[] arr = null;
		//int[] arr = {};
		int i =getArray(arr);
		System.out.println(i);
	}
	/*
	 * ���������������*2������
	 */
	public static int getArray(int[] arr) throws Exception{
		//�жϷ����������кϷ��Ե��жϣ������ж��ǲ���null
		if(arr == null){
			//�׳��쳣����ʽ�����ߵ�����
			//�ؼ��� throw  ֻ��д�ڷ����ڲ�
			//Exception(String message)  �����ָ����ϸ��Ϣ�����쳣��
			throw new Exception("�������鲻����");//�ֶ��׳����쳣��
		}
		//����������жϣ��ж��������Ƿ���Ԫ��
		if(arr.length ==0){
			//�׳��쳣����ʽ���ߵ����ߣ�������û��Ԫ��
			throw new Exception("������û���κ�Ԫ��");
		}
		int i = arr[arr.length-1];
		return i*2;
	}
}
