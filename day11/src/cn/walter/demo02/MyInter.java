package cn.walter.demo02;

/*
 * �ӿ��г�Ա���ص㣺
 * 	1.��Ա�������ص㣬û�б��������ǳ���
 * 	�̶������ʽ ��public static final �������� ������ = ֵ
 * 	public  Ȩ��
 * 	static  ���Ա�����ֱ�ӵ��ã� ����.������
 * 	final   ���գ��̶�ס������ֵ
 * 
 * 	ע�⣺public static final ���η����ڽӿڵĶ����У�����ʡ�Բ�д
 * 	���ǣ���д������û��
 * 	�������η���������ѡ������д
 * 
 * 	2.�ӿ��еĳ�Ա�����ص㣺
 *	public abstract ����ֵ���� �������������б�
 *	���η� public abstract ���Բ�д��ѡ������д
 *	����д��д������
 *
 *	3.ʵ���࣬ʵ�ֽӿڣ���д�ӿڵ�ȫ�����󷽷�������ʵ�������
 *	ʵ���࣬��д��һ���ֳ��󷽷���ʵ���࣬����һ�������࣬��Ϊ�����м̳й����ĳ��󷽷�
 */
public interface MyInter {
	public static final int x = 3;

	public abstract void show();

	public abstract int getSum(int a, int b);
}
