package cn.walter.demo03;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(){}

	public String toString() {
		return  name + "..." + age ;
	}
	
	
	/*
	 * û������д���࣬ÿ�����н�����ǲ�ͬ���� Hashֵ
	 * ��д�����Զ���Hashֵ
	 * ÿ��������hashֵ
	 * ��ϣֵ�Ǵ洢��HsahSet���ϵ�����
	 */
	public int hashCode(){
		return name.hashCode()+age;
	}
	//��дequals����
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		//���Ķ���Ϊ��
		if(obj ==null)
			return false;
		//��дequals����Ҫ�����͵�ǿת
		if(obj instanceof Person){
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		}
		//����
		return false;
	}
}

