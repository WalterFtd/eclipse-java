package cn.walter.demo11;
/*
 * ʹ����ʱ����Ҫд�ܳ��İ�����ͨ��import�����ķ�ʽ����
 *  ��ʽ��
 *  	import ����.����
 * 
 * �����
 */
import cn.walter.demo10.*;

public class B extends A {
	public void A(){
		//��Ϊi��Ĭ��Ȩ�ޣ�ֻ���ڱ�����ʹ��
		//System.out.println(i);
	}
	public void show(){
		//�ܱ���Ȩ�ޣ�ֻ������������棡������  ���ø�����ܱ�����Ա
		//super
		abc();
		
		//��ȥ�˾Ͳ����ˣ�����Ҳ���ܵ���
		//new A().abc();
	}
}
