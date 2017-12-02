package cn.walter.demo07;

public class Test {
	public static void main(String[] args) {
		//创建学生对象，Worker，指定姓名和年龄
		Student s = new Student("小明",20);
		System.out.println(s.getName()+"年龄"+s.getAge());
		//创建学生对象，Student，指定姓名额年龄
		Worker w = new Worker("光头强", 30);
		System.out.println(w.getName()+"年龄"+w.getAge());
	}
}
