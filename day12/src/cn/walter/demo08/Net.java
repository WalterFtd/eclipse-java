package cn.walter.demo08;
/*
 * �������繤��ʦ��
 * �����з�����Ա�����̳��з���
 */
public class Net extends Maintainer{
	public Net(String name,String id){
		super(name,id);
	}
	public void work(){
		System.out.println("���繤��ʦ"+super.getName()+super.getId()+"�����޸�����");
	}

}
