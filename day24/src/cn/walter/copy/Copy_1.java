package cn.walter.copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  ʹ�û�����������,�����ı��ļ�
 *  ����Դ  BufferedReader+FileReader ��ȡ
 *  ����Ŀ�� BufferedWriter+FileWriter д��
 *  ��ȡ�ı���, ��һ��,дһ��,д����
 */
public class Copy_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new FileReader("G��\\aa\\w.txt"));	
		BufferedWriter bfw = new BufferedWriter(new FileWriter("G��\\aa\\m.txt"));
		//��ȡ�ı���, ��һ��,дһ��,д����
		String line = null;
		while((line = bfr.readLine())!=null){
			bfw.write(line);
			bfw.newLine();
			bfw.flush();
		}
		bfw.close();
		bfr.close();
	}
}
