package cn.walter.demo06;
/*
 * �ڲ��ඨ��
 * 	���ڲ��࣬�������ⲿ�ĳ�Աλ��
 * ����Outer���ڲ�����Inner
 * 
 * ��Ա�����࣬����ʹ�ó�Ա���η���public static ...
 * Ҳ�Ǹ��࣬���Լ̳У�����ʵ�ֽӿ�
 * 
 * ���ù����ڲ��࣬����ʹ���ⲿ���Ա������˽��
 * 		     �ⲿ�࣬ʹ���ڲ�����󣬱��뽨���ڲ������
 */
public class Outer {
	private int a = 1;
	//�ⲿ���Աλ�ã������ڲ���
	class Inner{
		 public void inner(){
			 System.out.println("�ڲ��෽��inner"+a);
		 }
	}
}
