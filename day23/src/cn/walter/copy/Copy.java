package cn.walter.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  ������Դ c:\\a.txt
 *  ���Ƶ� d:\\a.txt  ����Ŀ��
 *  �ֽ�������,������Դ
 *  �ֽ������,������Ŀ��
 *  
 *  ����,��ȡ1���ֽ�
 *  ���,д1���ֽ�
 */
public class Copy {
	public static void main(String[] args) {
		//�����������Ķ������
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			//�����������Ķ���,������Դ������Ŀ��
			fis = new FileInputStream("G:\\aa\\w.txt");
			fos = new FileOutputStream("G:\\aa\\m.txt");
			//�ֽ�������,��ȡ1���ֽ�,�����д1���ֽ�
			int len = 0;
			while((len = fis.read())!=-1){
				fos.write(len);
			}
		}catch(IOException ex){
			System.out.println(ex);
			throw new RuntimeException("�ļ�����ʧ��");
		}finally{
			try {
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				throw new RuntimeException("�ͷ���Դʧ��");
			}finally{
				try {
					if(fis != null)
						fis.close();
				} catch (IOException e) {
					throw new RuntimeException("�ͷ���Դʧ��");
				}
			}
		}
	}
}
