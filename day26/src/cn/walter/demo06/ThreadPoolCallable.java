package cn.walter.demo06;

import java.util.concurrent.Callable;

/*
 * Callable �ӿڵ�ʵ����,��Ϊ�߳��ύ�������
 * ʹ�÷�������ֵ
 */

public class ThreadPoolCallable implements Callable<String>{
	//��д���󷽷�
	public String call(){
		return "asd";
	}
}
