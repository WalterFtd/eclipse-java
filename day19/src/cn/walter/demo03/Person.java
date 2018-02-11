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
	 * 没有做重写父类，每次运行结果都是不同整数 Hash值
	 * 重写，则自定义Hash值
	 * 每个对象都有hash值
	 * 哈希值是存储到HsahSet集合的依据
	 */
	public int hashCode(){
		return name.hashCode()+age;
	}
	//重写equals方法
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		//传的对象为空
		if(obj ==null)
			return false;
		//重写equals必须要做类型的强转
		if(obj instanceof Person){
			Person p = (Person)obj;
			return name.equals(p.name) && age == p.age;
		}
		//不是
		return false;
	}
}

