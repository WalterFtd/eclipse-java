package cn.walter.demo07;
/*
 * ��������Ƚ��������������ֵ
 * �ؼ��֣�intanceof���Ƚ�������������
 * 
 * person p = new Student();
 * p = new Teacher()
 * 
 * �ؼ���instanceof �Ƚϣ�һ���������͵ı������ǲ���������͵Ķ���
 * p��������Steudent���Ͷ��󣬻���Teacher���Ͷ���
 * 
 * ���ñ��� instanceof ����
 * p instanceof Student �Ƚϣ�p�ǲ���Student���͵Ķ��� ������ǣ�instanceof����true
 * 
 * ��̬����ת�ͣ��ô��ǿ��Ե�������͸���Ĺ������ݣ��׶ˣ����ܵ����������������
 * ����׶ˣ�ǿ������ת����ʽ
 */
public class Test {

	public static void main(String[] args) {
		//����������ѧ����������ΪPerson����
		Person p = new Student();
		//p.study();//���ܵ����������������
		
		Student s = (Student)p;//ǿ������ת����ʽ
		s.study();
		
//		Person p = new Tescher();
		boolean b = p instanceof Tescher;
		System.out.println(b);
		
		//b = p instanceof Animal;
		p.sleep();
		
		
	}

}
