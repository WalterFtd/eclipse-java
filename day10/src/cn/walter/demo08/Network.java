package cn.walter.demo08;
/*
 * 描述的是网络维护工程师
 * 属于维护部的员工，继承维护部类
 */
public class Network extends Maintainer {

	@Override
	public void work() {
		System.out.println(super.getName()+",网络工程师在检查网络是否畅通");
	}

}
