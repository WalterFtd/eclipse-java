package cn.walter.demo03;
/*
 * Throwable���еķ���
 * ���������������쳣����Ϣ�й�ϵ
 * 	String getMessage() ���쳣��Ϣ����ϸ����
 * 	String toString() ���쳣��Ϣ�ļ������
 * 	void printStackTrace ���쳣��Ϣ׷�ٵ���׼�Ĵ�����  �쳣��Ϣ��ȫ��JVMĬ�ϵ��÷���
 */
public class ExceptionDemo1 {	
	public static void main(String[] args) {
		try{
			function();
		}catch(Exception ex){
			//���������ø��෽��
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
	}
	public static void function()throws Exception{
		throw new Exception("�쳣��!");
	}
}
