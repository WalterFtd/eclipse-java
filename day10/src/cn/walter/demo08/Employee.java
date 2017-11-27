package cn.walter.demo08;
/*
 * 定义员工类
 * 	内容，都是所有子类的共性抽取
 * 		属性 ：姓名name 工号 Id
 * 		方法：工作work（抽象）
 */
public abstract class Employee {
	private String name;
	private String Id;
	//定义工作方法
	public abstract void work();
	public void setName(String name){
		this.name = name;
	}
	public void setId(String Id){
		this.Id = Id;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return Id;
	}
}
