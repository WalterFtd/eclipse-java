package cn.walter.demo01;

import java.io.File;
import java.io.IOException;

/*
 * File��Ĵ�����ɾ������
 * �ļ�������Ŀ¼
 */
public class FileDemo2 {
	public static void main(String[] args)throws IOException{
		function_2();
	}
	/*
	 * File���ɾ������
	 * boolean delete()
	 * ɾ�����ļ��������ļ��У���Fiel���췽���и���
	 * ɾ���������߻���վ��ֱ�Ӵ�Ӳ��ɾ��
	 */
	private static void function_2() {
		File file = new File("G:\\aa\\a.txt");
		boolean b = file.delete();
		System.out.println(b);
	}
	/*
	 * File�����ļ��й���
	 * booean mkdir() һ��
	 * booean mkdirs() ���
	 * ������·��Ҳ��File���췽���и���
	 * ���ļ����Ѿ������ˣ����ٴ���
	 */
	private static void function_1() {
		File file = new File("G:\\aa\\dd");
		boolean b = file.mkdirs();
		System.out.println(b);
	}

	/*
	 * File�����ļ��Ĺ���
	 * boolean createBewFile()
	 * �������ļ�·�����ļ�������File���췽���и���
	 */
	public static void function()throws IOException{
		File file = new File("G:\\aa\\a.txt");
		boolean b = file.createNewFile(); //(δ������쳣 IO�쳣)
		System.out.println(b);
	}
}
