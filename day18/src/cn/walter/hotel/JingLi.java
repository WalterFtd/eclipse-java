package cn.walter.hotel;
/*
 * ���徭����
 * 	����Ա����һ�֣�û��VIP����
 * 	�Լ��н�������
 */
public class JingLi extends Employee{
	
	public JingLi() {}
	
	public JingLi(String name,String id,double money) {
		super(name,id);
		this.money = money;
	}

	//���影������
	private double money;
	public void work(){
		System.out.println("�����ڹ�����Ա");
	}
}
