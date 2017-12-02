package cn.walter.demo08;
/*
 * 定义网络工程师类
 * 属于研发部的员工，继承研发部
 */
public class Net extends Maintainer{
	public Net(String name,String id){
		super(name,id);
	}
	public void work(){
		System.out.println("网络工程师"+super.getName()+super.getId()+"正在修复网络");
	}

}
