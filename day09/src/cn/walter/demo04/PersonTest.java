package cn.walter.demo04;

/*
 * ����õ�Person����в���
 * �������󣬶���������Ժͷ���
 */
public class PersonTest {

	public static void main(String[] args) {
		// ����Person��Ķ��� new
		Person p = new Person();
		// �Գ�Ա������ֵ
		// p.age = 20;
		p.setAge(150);
		p.name = "С��";
		// �������з���
		p.speak();
		
		//�����Ա����ageֵ���������get����
		System.out.println(p.getAge());
	}

}
