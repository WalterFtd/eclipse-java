package cn.walter.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  �ֽ��������ļ�
 *   �������黺�����Ч��
 *   �ֽ�����
 *   FileInputStream ��ȡ�ֽ�����
 *   FileOutputStream д�ֽ�����
 */
public class Copy_1 {
	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("G:\\aa\\abc.pdf");
			fos = new FileOutputStream("G:\\aa\\aaa.pdf");
			//�����ֽ�����,����
			byte[] b = new byte[1024];
			//��ȡ����,д������
			int len = 0;
			while((len = fis.read(b))!=-1){
				fos.write(b,0,len);
			}	
		}catch(IOException ex){
			System.out.println(ex);
			throw new RuntimeException("�ļ�����ʧ��");			
		}finally{
			try {
				if(fos!=null)
				fos.close();
			} catch (IOException ex) {
				throw new RuntimeException("�ͷ���Դʧ��");	
			}finally{
				try {
					if(fis!=null)
					fis.close();
				} catch (IOException ex) {
					throw new RuntimeException("�ͷ���Դʧ��");		
				}
			}
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}
}
