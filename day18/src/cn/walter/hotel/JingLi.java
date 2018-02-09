package cn.walter.hotel;
/*
 * 定义经理类
 * 	属于员工的一种，没有VIP功能
 * 	自己有奖金属性
 */
public class JingLi extends Employee{
	
	public JingLi() {}
	
	public JingLi(String name,String id,double money) {
		super(name,id);
		this.money = money;
	}

	//定义奖金属性
	private double money;
	public void work(){
		System.out.println("经理在管理人员");
	}
}
