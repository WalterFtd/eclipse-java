package cn.walter.demo02;

import java.util.HashSet;

import cn.walter.demo03.Person;
/*
 * HashSet���ϵ������ص�
 * 	�ײ����ݽṹ����ϣ��
 * 	�洢��ȡ�����ȽϿ�
 * 	�̲߳���ȫ�������ٶȿ�
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		/*HashSet<String> set = new HashSet<String>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new String("bbc"));
		set.add(new String("bbc"));
		System.out.println(set);*/
		
		//��Person�����е����������䣬��ͬ���ݣ�����ͬһ������
		//�ж϶��� �Ƿ��ظ������������Լ��ķ���hashCode,equals
		HashSet<Person> setPerson = new HashSet<Person>();
		setPerson.add(new Person("a",20));
		setPerson.add(new Person("b",21));
		setPerson.add(new Person("b",21));//�������ϲ���ͬһ������
		setPerson.add(new Person("c",22));
		setPerson.add(new Person("d",23));
		System.out.println(setPerson);
		
	}
}