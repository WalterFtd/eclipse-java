package cn.walter.demo02;
/*
 * ���峤������
 * 	����������ܳ�
 *
 * �߳�����Ƶ�ʱ�򣬶���Ϊ��Ա�������������㷽���ľֲ�����
 * ����˭�ģ����ڳ������������ÿ����������Ĺ���
 * 
 * ���ۣ���������Ǹ����һ���֣�����Ϊ��Ա��������ֻ�ǹ��ܵ�һ���֣���Ϊ�βα���
 */
public class CFX {
	private int w;
	private int h;
	
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	//���췽��
	public CFX(int w, int h) {
		this.w = w;
		this.h = h;
	}
	//�󳤷������
	public int getArea(){
		return w*h;
	}
	//�󳤷����ܳ�
	public int getLong(){
		return (w+h)*2;
	}
	
	
}

