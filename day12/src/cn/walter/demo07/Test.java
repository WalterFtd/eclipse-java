package cn.walter.demo07;

public class Test {
	public static void main(String[] args) {
		//����ѧ������Worker��ָ������������
		Student s = new Student("С��",20);
		System.out.println(s.getName()+"����"+s.getAge());
		//����ѧ������Student��ָ������������
		Worker w = new Worker("��ͷǿ", 30);
		System.out.println(w.getName()+"����"+w.getAge());
	}
}
