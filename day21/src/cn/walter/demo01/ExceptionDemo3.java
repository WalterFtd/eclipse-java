package cn.walter.demo01;
/*
 * �쳣�Ĵ���ʽ
 * 	try...catch...finally
 * 	��ʽ��
 * 		try{
 * 			�����Ĵ���
 * 			���ܳ����쳣�Ĵ���
 * 		}catch(�쳣���� ����){
 * 			�쳣�Ĵ���ʽ
 * 			ѭ�����жϣ����÷���������
 * 		}finally{
 * 			����Ҫִ�еĴ���
 * 		}
 * 		finally�����۳����Ƿ����쳣ʵ�֣���Ҫִ�У����ǽ����������System.exit(0);
 * 		�ͷ���Դ
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		try{
		function(1);
		}catch(Exception ex){
			System.out.println(ex);
			//System.exit(0);
		}finally{
			System.out.println("����������ִ��");
		}
	}

	private static void function(int a)throws Exception {
		if( a==1){
			throw new Exception();
		} 
		System.out.println(a);
	}
	
}
