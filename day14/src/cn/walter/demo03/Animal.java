package cn.walter.demo03;

public abstract class Animal {
	public abstract void eat();
	/*
	 * ������Animal�����巽��������ֵ��Animal����
	 * ������û�ж��󣬴˷���������ã�дΪ��̬����
	 */
	public static Animal getInstance(){
		return new Cat();
	}
}
