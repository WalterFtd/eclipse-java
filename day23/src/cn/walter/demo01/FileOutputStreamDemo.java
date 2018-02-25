package cn.walter.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   FileOutputStream
 *   д�������ļ�,ѧϰ���෽��,ʹ���������
 *   
 *   �����еĹ��췽��: ����:����������Ŀ��
 *     ����:
 *       File    ��װ�ļ�
 *       String  �ַ������ļ���
 *   
 *   ������ʹ�ò���
 *     1. ����������Ķ���,������Ŀ��
 *     2. ����������ķ���writeд
 *     3. close�ͷ���Դ
 *     
 *    ������Ĺ��췽��,���Դ����ļ�,����ļ�����,ֱ�Ӹ���
 */

public class FileOutputStreamDemo {
	public static void main(String[] args)throws IOException{
		FileOutputStream fos = new FileOutputStream("G:\\aa\\w.txt");//�ļ�����쳣
		//������ķ���writeд����
		//д1���ֽ�
		fos.write(100);//�ļ�IO�쳣
		
		//д�ֽ�����
		byte[] bytes = {65,66,67,68};
		fos.write(bytes);
		
		//д�ֽ������һ����,��ʼ����,д����
		fos.write(bytes, 1, 2);
		
		//д���ֽ�����ļ�㷽ʽ
		//д�ַ���
		fos.write("hello".getBytes());
		
		//�ر���Դ
		fos.close();	
	}
}