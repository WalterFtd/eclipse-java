package cn.walter.demo02;
/*
 *  ��ȡ�߳�����,����Thread����
 *    String getName()
 *    (�Ǿ�̬��)
 */
public class NameThread extends Thread{
	public NameThread(){
		super("dsds");
	}
	public void run(){
		//ͨ�����෽����ȡ����
		System.out.println(super.getName());
	}
}
