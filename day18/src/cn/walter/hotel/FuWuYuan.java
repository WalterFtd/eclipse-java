package cn.walter.hotel;
/*
 * �������Ա��
 * ����Ա����һ�֣����ж��������
 * �̳�Employee��ʵ��VIP�ӿ�
 */
public class FuWuYuan extends Employee implements VIP{
	//�ղ������췽��
	public FuWuYuan() {}
	//���������췽����ֱ��super�����༴�ɣ��ø���������
	public FuWuYuan(String name, String id) {
		super(name, id);
	}
	//���󷽷���д
	public void work(){
		System.out.println("����Ա�ڶ�����");
	}
	public void services(){
		System.out.println("����Ա�����Ӽӱ�");
	}
}
