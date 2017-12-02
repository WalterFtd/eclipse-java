package cn.walter.demo01;
/*
 * 自定义的Person类，成员变量，name age
 * 要求在new Person的同时，就指定好name，age的值
 * 实现功能，利用方法去实现，构造方法，构造器 Constructor
 * 作用：在new 的同时对成员变量赋值，给对象的属性初始化赋值，new Person，对属性name，age赋值
 *
 *	构造方法的定义格式
 *		权限 方法名 （参数列表）{
 *		}
 *		方法的名字，必须和类的名字完全一致
 *		构造方法不允许写返回值类型，void 也不能写
 *
 *		构造方法在什么时候运行呢，在new 的时候，自动执行
 *		只运行一次
 *
 *	每个class必须拥有构造方法，构造方法不写也有
 *	编译的时候，javac，会自动检查类中是否有构造方法
 *	如果有，就不添加
 *	如果没有，构造器就会自动添加一个构造方法：public Person(){}
 *	
 */
public class Person {
	private String name;
	private int age;
	
	//定义Person类的构造方法
	public Person(String name,int age){
//		System.out.println("我是一个空参数的构造方法");
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
