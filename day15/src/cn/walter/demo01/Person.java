package cn.walter.demo01;

public class Person extends Object{
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * ��д����ķ���toSting()
	 * û�б�Ҫ�õ����߿����ڴ��ַ
	 * Ҫ�󣺷����У�����ֵ�����г�Ա������ֵ
	 */
	public String toString(){
		return name+age;
	}
	/*
	 *������ĵ�equals����д��ȥ����д����ķ���
	 *���ǣ����ı丸�෽����Դ���룬����equals �Ƚ�������������ݵĵ�ַ
	 */
	public boolean equals(Object obj){
		return this == obj;
	}
	
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
	

}
