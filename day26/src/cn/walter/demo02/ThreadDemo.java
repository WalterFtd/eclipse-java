package cn.walter.demo02;
/*
 *  ÿ���߳�,�����Լ�������
 *  ���з���main�߳�,���־���"main"
 *  �����¼����߳�Ҳ������,Ĭ�� "Thread-0","Thread-1"
 *  
 *  JVM�������߳�,���з���main,���߳�Ҳ���߳�,���̱߳�Ȼ����
 *  Thread�����
 *  Thread����,��̬����
 *   static Thread currentThread()��������ִ�е��̶߳���
 */
public class ThreadDemo {
	public static void main(String[] args) {
		NameThread nt = new NameThread();
		nt.setName("ds");
		nt.start();
		NameThread nt1 = new NameThread();
		nt1.start();
		//�õ�mian���߳�����,JVM����main�߳�
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
}
