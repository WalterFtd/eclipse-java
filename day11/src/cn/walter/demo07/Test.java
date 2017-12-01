package cn.walter.demo07;
/*
 * 运算符：比较运算符，结果真假值
 * 关键字，intanceof，比较引用数据类型
 * 
 * person p = new Student();
 * p = new Teacher()
 * 
 * 关键字instanceof 比较，一个引用类型的变量，是不是这个类型的对象
 * p变量，是Steudent类型对象，还是Teacher类型对象
 * 
 * 引用变量 instanceof 类名
 * p instanceof Student 比较，p是不是Student类型的对象 ，如果是，instanceof返回true
 * 
 * 多态向上转型，好处是可以调用子类和父类的公有内容，弊端：不能调用子类的特有内容
 * 解决弊端：强制类型转换公式
 */
public class Test {

	public static void main(String[] args) {
		//类型提升，学生类型提升为Person类型
		Person p = new Student();
		//p.study();//不能调用子类的特有内容
		
		Student s = (Student)p;//强制类型转换公式
		s.study();
		
//		Person p = new Tescher();
		boolean b = p instanceof Tescher;
		System.out.println(b);
		
		//b = p instanceof Animal;
		p.sleep();
		
		
	}

}
