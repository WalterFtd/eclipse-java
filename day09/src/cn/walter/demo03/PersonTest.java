package cn.walter.demo03;
/*
 * 方法的参数类型，是基本数据类型，引用数据类型
 */
public class PersonTest {

	public static void main(String[] args) {
		int a = 1;
		functon(a);
		System.out.println(a);
		
		Person p = new Person();
		p.name = "秦风";
		System.out.println(p.name);
		function(p);
		System.out.println(p.name);
	}
	/*
	 * 定义方法，参数是引用数据类型
	 * 参数是Person类型
	 */
	public static void function(Person p){
		p.name = "余淮";
	}
	/*
	 * 定义方法，参数类型是基本数据类型
	 */
	public static void functon(int a){
		a+=5;
	}
}
