package cn.walter.demo01;
/*
 * 定义研发部员工
 * 属于员工的一种
 * 研发部员工继承员工类
 * 关键字extends
 * 
 * 子类是Develop，父类是Employee
 * 子类自动拥有父类中可以继承的属性和方法
 * 同时观察两个类才行（好处，可以少写类）
 */
public class Develop extends Employee{
	//在子类中可以定义方法
	public void print(){
		System.out.println(name);
	}

}
