package cn.walter.demo03;

public class StringBufferTest {
	public static void main(String[] args) {
		int[] arr = {2,1,3,6,89};
		System.out.println(toString(arr));
	}
	/*
	 * int[] arr = {34,12,89,68};��һ��int[]��Ԫ��ת���ַ���
	 * ��ʽ[34,12,89,68]
	 * String s = "["
	 * �������
	 * s+=arr[i];
	 * s+"]"
	 * StringBufferʵ�֣���Լ�ڴ�ռ䣬String + �ڻ������У�append����
	 */
	public static String toString(int[] arr){
		//�����ַ���������
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		//�������
		for (int i = 0; i < arr.length; i++) {
			//�ж��ǲ�����������һλԪ��
			if(i ==arr.length-1){
				buffer.append(arr[i]).append("]");
			}else{
				buffer.append(arr[i]).append(",");
			}
		}
		return buffer.toString();
	}
}
