package cn.walter.demo06;


public class Person {
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	/*
	 * ���巽�����Ƚ��Ƿ���ͬ���ˣ��Ǿͷ���true�����Ǿͷ���false
	 * ˭��˭�Ƚϣ��Լ��ͱ��˱�
	 * �����ķ���ֵ��true false
	 * ��������������
	 */
	public boolean compare(Person p){
		//�Լ��ͱ��˱����䣬this��p
		return this.age == p.age;
	}
}
