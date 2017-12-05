package cn.walter.demo11;
/*
 * 使用类时，需要写很长的包名，通过import导包的方式来简化
 *  格式：
 *  	import 报名.类名
 * 
 * 导入包
 */
import cn.walter.demo10.*;

public class B extends A {
	public void A(){
		//因为i是默认权限，只能在本包下使用
		//System.out.println(i);
	}
	public void show(){
		//受保护权限，只能是子类的里面！！！！  调用父类的受保护成员
		//super
		abc();
		
		//出去了就不行了，对象也不能调用
		//new A().abc();
	}
}
