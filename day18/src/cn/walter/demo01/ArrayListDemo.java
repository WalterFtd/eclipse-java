package cn.walter.demo01;

import java.util.ArrayList;
/*
 * ������ϵ��
 * 	Ŀ�� ���ϱ�����һ���洢������
 *  1.����ʹ�ü��ϴ洢����
 *  2.�������ϣ�ȡ������
 *  3.�����Լ�������
 * 	���ӣ�ArrayList�������һ���ɱ�����->��������ȥѡ�񼯺�����
 */

public class ArrayListDemo {
	public static void main(String[] args) {
		/*
		 *����ArrayList���洢int������
		 *���ϱ������ܻ����࣬�����Զ�װ����Ʊ�ɰ�װ��洢
		 */
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(11);
		array.add(12);
		array.add(13);
		array.add(14);
		array.add(15);
		for(int i = 0;i<array.size();i++){
			System.out.println(array.get(i));
		}
		/*
		 * ���ϴ洢�Զ����Person��Ķ���
		 */
		ArrayList<Person> arrayPer = new ArrayList<>();
		//����������װ��������Ҳ����װ��������
		arrayPer.add(new Person("a",20));
		arrayPer.add(new Person("b",19));
		arrayPer.add(new Person("c",18));
		for(int i = 0; i < arrayPer.size(); i++){
			//get(����),����Person����
			//��ӡ����һ�����󣬱������toString()
			//���������д��toString����������õ����������д���� 
			System.out.println(arrayPer.get(i));
		}
	}
}
