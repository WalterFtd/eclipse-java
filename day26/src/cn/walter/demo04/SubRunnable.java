package cn.walter.demo04;
/*
 *  ʵ���̳߳ɹ�����һ����ʽ,�ӿ�ʵ��
 *  ʵ�ֽӿ�Runnable,��дrun����
 */

public class SubRunnable implements Runnable{
	public void run(){
		for(int i = 0 ; i < 50; i++){
			System.out.println("run..."+i);
		}
	}
}