package cn.walter.demo03;
/*
 * �����Ĳ������ͣ��ǻ����������ͣ�������������
 */
public class PersonTest {

	public static void main(String[] args) {
		int a = 1;
		functon(a);
		System.out.println(a);
		
		Person p = new Person();
		p.name = "�ط�";
		System.out.println(p.name);
		function(p);
		System.out.println(p.name);
	}
	/*
	 * ���巽����������������������
	 * ������Person����
	 */
	public static void function(Person p){
		p.name = "�໴";
	}
	/*
	 * ���巽�������������ǻ�����������
	 */
	public static void functon(int a){
		a+=5;
	}
}
