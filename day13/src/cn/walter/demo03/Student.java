package cn.walter.demo03;
/*
 * 静态注意事项
 * 在静态中不能调用非静态，原因：生命周期，有静态时还没非静态
 * 静态不能用this(),也不能用super()
 * 静态方法不能直接调用非静态方法，非要调用，就先new个自己再调用
 * 
 * static 应用场景：
 * static 修饰成员变量，成员方法
 * 成员变量加static ，根据具体事务，具体分析
 * 定义事务的时候，多个事务之间是否有共性的数据！！
 * 请你将共性的数据定义为静态的成员方法
 * 
 * 成员方法加static，跟着变量走
 * 	如果方法，没有调用过非静态成员，将方法定义为静态
 * 
 * 只要方法中没用过非静态成员的，加上静态
 */
public class Student {
	private static String name;
	private static int age;

	public static void function(){
		System.out.println(name+age);
	}
	
	public void show(){
		System.out.println(name+age);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.function();
	}
}
