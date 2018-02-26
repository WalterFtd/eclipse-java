package cn.walter.demo06;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 *  ʵ���̳߳���ĵ�������ʽ,ʵ��Callable�ӿڷ�ʽ
 *  ʵ�ֲ���
 *    ������ Executors��̬����newFixedThreadPool����,�����̳߳ض���
 *    �̳߳ض���ExecutorService�ӿ�ʵ����,���÷���submit�ύ�߳�����
 *    submit(Callable c)
 */
public class ThreadPoolDemo1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		//�ύ�߳�����ķ���submit�������� Future�ӿڵ�ʵ����
		Future<String> f = es.submit(new ThreadPoolCallable());
		// V get() ���б�Ҫ���ȴ�������ɣ�Ȼ���ȡ������ 
		String s = f.get();
		System.out.println(s);
	}
}
