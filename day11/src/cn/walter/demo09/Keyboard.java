package cn.walter.demo09;
/*
 * �Զ���ļ�����
 * ����USB�ӿڹ淶
 * ʵ��USB�ӿڣ���д���󷽷�
 */
public class Keyboard implements USB {
	public void open() {
		System.out.println("��������");
	}

	public void close() {
		System.out.println("�رռ���");
	}

}
