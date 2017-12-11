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
	 * 重写父类的方法toSting()
	 * 没有必要让调用者看到内存地址
	 * 要求：方法中，返回值中所有成员变量的值
	 */
	public String toString(){
		return name+age;
	}
	/*
	 *将父类的的equals方法写过去，重写父类的方法
	 *但是，不改变父类方法的源代码，方法equals 比较两个对象的内容的地址
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
