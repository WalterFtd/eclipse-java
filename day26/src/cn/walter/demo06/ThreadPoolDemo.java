package cn.walter.demo06;
/*
 *  JDK1.5������,ʵ���̳߳س���
 *  ʹ�ù����� Executors�еľ�̬���������̶߳���,ָ���̵߳ĸ���
 *   static ExecutorService newFixedThreadPool(int ����) �����̳߳ض���
 *   ���ص���ExecutorService�ӿڵ�ʵ���� (�̳߳ض���)
 *   
 *   �ӿ�ʵ�������,���÷���submit (Ruunable r) �ύ�߳�ִ������
 *          
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		//���ù�����ľ�̬����,�����̳߳ض���
		//�����̳߳ض���,�Ƿ��صĽӿ�
		ExecutorService es = Executors.newFixedThreadPool(2);
		//���ýӿ�ʵ�������es�еķ���submit�ύ�߳�����
		//��Runnable�ӿ�ʵ�������,����
		es.submit(new ThreadPoolRunnable());//�̲߳������ֻ�ȥ�ˣ�����һֱ������
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		
		es.shutdown();//���ٴ��̳߳أ�һ�㲻�ã����̳߳�Ŀ�ľ��Ƿ�ֹƵ�������������߳�
	}
}
