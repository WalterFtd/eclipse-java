package cn.walter.demo03;

import java.io.File;

/*
 * ��һ��Ŀ¼�µ��������ݣ�������ȫ�ı���
 * ��̼��ɣ������ĵݹ���ã��Լ������Լ�
 */
public class FileDemo {
	public static void main(String[] args) {
		File dir = new File("G:\\aa");
		getAllDir(dir);
	}
	/*
	 * ���巽��ʵ��Ŀ¼��ȫ����
	 */
	private static void getAllDir(File dir) {
		//���÷���listFiles()��Ŀ¼��dir���б���
		File[] fileArr = dir.listFiles();
		for(File f : fileArr){
			//�жϱ�����·���ǲ����ļ���
			if(f.isDirectory()){
				//��һ��Ŀ¼����Ҫȥ����
				//��������getAllDir�����Ǹ���Ŀ¼����
				//�ݹ����
				getAllDir(f);	
			}
			System.out.println(f);	
		}
	}
	
}
