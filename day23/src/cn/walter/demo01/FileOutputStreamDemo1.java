package cn.walter.demo01;
/*
 *  FileOutputStream �ļ�����д�ͻ�������
 *  ��д: FileOutputStream���췽��, �ĵڶ���������,����true
 *  ���ļ���,д�뻻��,���Ż���  \r\n
 *  \r\n ����д����һ�е�ĩβ, Ҳ����д����һ�еĿ�ͷ
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("G:\\aa\\w.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		fos.write("hello\r\n".getBytes());
		fos.write("walter".getBytes());
		fos.close();
		
	}
}