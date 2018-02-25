package cn.walter.demo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��ʵ���ı�����
 *   ��ȡ����Դ  BufferedReader+File ��ȡ�ı���
 *   д������Ŀ�� PrintWriter+println �Զ�ˢ��
 */
public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bft = new BufferedReader(new FileReader("G:\\aa\\w.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("G:\\aa\\m.txt"));
		String line = null;
		while((line = bft.readLine())!=null){
			pw.println(line);
		}
		pw.close();
		bft.close();
	}
	
}
