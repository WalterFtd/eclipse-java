package cn.walter.demo02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 *  �ֽ��������Ļ�����
 *    java.io.BufferedInputStream 
 *     �̳�InputStream,��׼���ֽ�������
 *     ��ȡ����  read() �����ֽ�,�ֽ�����
 *    
 *    ���췽��:
 *      BufferedInputStream(InputStream in)
 *      ���Դ���������ֽ�������,������˭,�����˭��Ч��
 *      ���Դ��ݵ��ֽ������� FileInputStream
 */
public class BufferInputStreamDemo {
	public static void main(String[] args) throws IOException{
		//�����ֽ��������Ļ���������,���췽���а�װ�ֽ�������,��װ�ļ�
		BufferedInputStream bis = new 
				BufferedInputStream(new FileInputStream("G:\\aa\\w.txt"));
		byte[] bytes = new byte[10];
		int len = 0 ;
		while((len = bis.read(bytes))!=-1){
			System.out.print(new String(bytes,0,len));
		}
		bis.close();


	}
}
