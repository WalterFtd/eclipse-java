package cn.walter.demo02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
 * Map�ӿ�ʵ����Hashtable
 * �ײ����ݽ����ϣ���ص��HashMap��һ����
 * Hashtable �̰߳�ȫ���ϣ������ٶ���
 * HashMap �̲߳���ȫ�ļ��ϣ������ٶȿ�
 * 
 * Hashtable���˺�Vector��һ���ģ���JDK1.2��ʼ�������Ƚ���HashMapȡ��
 * 
 * HashMap����洢nullֵ��null��
 * Hashtable������洢nullֵ��null��
 * 
 * Hashtable������Properties,���ɻ�Ծ�ڿ�����̨
 */
public class HashtableDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put(null,null);
		System.out.println(map);
		
		Map<String,String> map1 = new Hashtable<String,String>();
		map1.put(null,null);
		System.out.println(map1);
	}
	
	
}
