package cn.walter.demo01;

import java.util.Random;
import java.util.Scanner;

public class TestToString {
	public static void main(String[] args) {
		//����Person��ķ���toSting()
		//�������У�д����һ������Ĭ�ϵ��ö����toStirng����
		Person p = new Person("������",10);
		String s = p.toString();
		System.out.println(p);
		System.out.println(s);
		/*
		 * System.out.println(p);
		 * System.out.println(p.toString());
		 */
		//random�ǵ�ַ��û����д��Scanner�����ݣ���д����
		Random r = new Random();
		System.out.println(r);
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
	}
}
