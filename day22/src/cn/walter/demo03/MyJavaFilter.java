package cn.walter.demo03;

import java.io.File;
import java.io.FileFilter;

public class MyJavaFilter implements FileFilter {

	public boolean accept(File pathname) {
		//�ж���Ŀ¼����ֱ��Ϊ��
		if(pathname.isDirectory())
			return true;
		return pathname.getName().toLowerCase().endsWith(".java");//�õ����ֱ�Сд�����ж�ĩβ
	}

}
