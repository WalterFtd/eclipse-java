package cn.walter.demo01;

public class ArrayTools {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int i = getArray(arr);//main����������쳣��mainҲû�ж�����Խ���쳣���д����׸�main�ĵ�����JVM
		//JVM�յ��쳣��������������          1.���쳣��Ϣ���Ժ�ɫ�������������̨ ��λ�ã���Ϣ��  2.ֹͣ��������
		System.out.println(i);
	}

	private static int getArray(int[] arr) {
		/*
		 * arr[3]û�����������JVM�ܹ���⵽���������Խ������
		 * JVM��
		 * 1.�������쳣�Ķ��� new ArrayIndexOutOfBoundsException(3)
		 * 2.��getArray���ң���û�г�����Դ����쳣���Ҳ���
		 * 3.���쳣�Ķ�������׳����׸������ĵ�����
		 * ע�⣺һ���쳣���׳��ˣ�����ĳ���Ͳ���ִ��
		 */
		int i = arr[3];
		return i+1;
	}
	
}
