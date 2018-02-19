package cn.walter.demo03;

import java.io.File;
import java.io.FileFilter;

public class MyJavaFilter implements FileFilter {

	public boolean accept(File pathname) {
		//判断是目录，就直接为真
		if(pathname.isDirectory())
			return true;
		return pathname.getName().toLowerCase().endsWith(".java");//得到名字变小写，再判断末尾
	}

}
