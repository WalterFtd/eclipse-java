package cn.walter.hotel;
/*
 * 酒店的员工类
 * 	员工共性，姓名，工号，工作方法
 */
public abstract class Employee {
	private String name;
	private String id;
	//提供两套构造方法
	//一套空参，一套有参数
	public Employee(){
		
	}
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	//定义工作方法
	public abstract void work();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
