package cn.walter.demo03;
/*
 * ��̬ע������
 * �ھ�̬�в��ܵ��÷Ǿ�̬��ԭ���������ڣ��о�̬ʱ��û�Ǿ�̬
 * ��̬������this(),Ҳ������super()
 * ��̬��������ֱ�ӵ��÷Ǿ�̬��������Ҫ���ã�����new���Լ��ٵ���
 * 
 * static Ӧ�ó�����
 * static ���γ�Ա��������Ա����
 * ��Ա������static �����ݾ������񣬾������
 * ���������ʱ�򣬶������֮���Ƿ��й��Ե����ݣ���
 * ���㽫���Ե����ݶ���Ϊ��̬�ĳ�Ա����
 * 
 * ��Ա������static�����ű�����
 * 	���������û�е��ù��Ǿ�̬��Ա������������Ϊ��̬
 * 
 * ֻҪ������û�ù��Ǿ�̬��Ա�ģ����Ͼ�̬
 */
public class Student {
	private static String name;
	private static int age;

	public static void function(){
		System.out.println(name+age);
	}
	
	public void show(){
		System.out.println(name+age);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.function();
	}
}
