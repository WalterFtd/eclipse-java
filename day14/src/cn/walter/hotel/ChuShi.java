package cn.walter.hotel;
/*
 * �����ʦ��
 * ����Ա����һ�֣����ж��������
 * �̳�Employee��ʵ��VIP�ӿ�
 */
public class ChuShi extends Employee implements VIP{
	//�ղ������췽��
	public ChuShi() {}
	//�в������췽����ֱ��super�����༴�ɣ��ø���������
	public ChuShi(String name, String id) {
		super(name, id);
	}
	//���󷽷���д
	public void work(){
		System.out.println("��ʦ���ղ�");
	}
	public void services(){
		System.out.println("��ʦ���˼���");
	}
}
