package cn.walter.demo02;

import java.io.File;
import java.io.FileFilter;

/*
 * �Զ��������
 * ʵ��FileFilter�ӿڣ���д���󷽷�
 */
public class MyFilter implements FileFilter{
	 public boolean accept(File pathname){
		 /*
		  * pathname ���ܵ���Ҳ���ļ���ȫ·��
		  * ��·�������жϣ������java�ļ�������true������java�ļ�������false
		  * �ļ���׺��βʱ.java
		  */
		 String name = pathname.getName();
		 return name.endsWith(".txt");
	 }  
}
