package cn.walter.classes;
/*
 * ����Ϊ���������뷵��ֵ
 */
public class TestReturn {
	public static void main(String[] args) {
		//����GetPerson��ķ���get
		//����ֵ��Person����
		GetPerson g = new GetPerson();
		//ͨ������ֵ���õ��½���person�����
		Person p = g.get();
		p.eat();
		p.run();
		
		//new GetPerson().get().eat(); ����������
	}
}
