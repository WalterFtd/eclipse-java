package cn.walter.demo10;

public class C {
	public void show(){
		//默认权限在本包下能用，其他包的子类都不行
		System.out.println(new A().i);
		//protected兼容默认，所以在本包下也能调用
		new A().abc();
	}
}
