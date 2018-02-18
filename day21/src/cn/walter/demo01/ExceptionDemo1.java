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
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] arr = new int[0];
		//int[] arr = null;
		try{
			int i = getArray(arr); //try����쳣���׸�catch�����
			System.out.println(i);
		}catch(NullPointerException ex){ //catch�������쳣NullPointerException ex = new NullPointerException("���鲻����");
			System.out.println(ex);//�����쳣
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex);//�����쳣
		}
		System.out.println("Game over");
	}
	/*
	 * ���巽�����׳�����
	 * ������ʹ��try catch
	 */
	public static int getArray(int[] arr)throws NullPointerException,ArrayIndexOutOfBoundsException{
		//�������п�
		if(arr == null){
			//�ֶ��׳��쳣���׳���ָ���쳣
			throw new NullPointerException("���鲻����");//���򴴽�һ���쳣����󲢣�throw���׸�������
		}
		//����������������ж�
		if(arr.length<3){
			//�ֶ��׳��쳣����������Խ���쳣
			throw new ArrayIndexOutOfBoundsException("����û��3����");
		}
		return arr[3]+1;
	}
}
