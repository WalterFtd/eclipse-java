package cn.walter.demo06;
/*
 * ���췽����һ�У�дthis()����super()
 * ����ͬʱ���ڣ���ѡ��һ����֤��������й��췽�����õ�����Ĺ��췽������
 * 
 * ���ۣ�������Σ���������й��췽����ֱ�ӣ���ӱ�����õ����๹�췽��
 * ����Ĺ��췽����ʲô����д��Ĭ�ϵĹ��췽����һ��super();
 */
public class Student extends Person {

	public Student() {
		//���õ����Լ��Ĺ��췽��
		//�����ʽ���õ��˸���Ĺ��췽��
		this("dsd");
	}
	public Student(String s){
		super(1);
	}
}
