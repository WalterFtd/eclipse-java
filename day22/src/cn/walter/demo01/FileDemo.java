package cn.walter.demo01;

import java.io.File;

/*
 * java.io.File
 * 	������ϵͳ�еģ��ļ���Ŀ¼���ļ��У���·������װ��File����
 * 	�ṩ����->����ϵͳ�е�����
 * 	File��ϵͳ�޹ص���
 * 	�ļ���file
 *  Ŀ¼��directory
 *  ·����path
 */
public class FileDemo {
	public static void main(String[] args) {
		//File��ľ�̬��Ա����
		//��ϵͳ�йص�·���ָ���
		String separator = File.pathSeparator;
		System.out.println(separator);//��һ���ֺ� ";"-> Ŀ¼�ķָ�ָ�����Linux����":"
		
		//��ϵͳ�йص�Ĭ�����Ʒָ���
		separator = File.separator;
		System.out.println(separator);//���ҵ�б�� "\"->Ŀ¼���Ƶķָ� Linux����"/"
	}
}
