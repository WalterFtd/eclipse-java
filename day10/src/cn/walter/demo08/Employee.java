package cn.walter.demo08;
/*
 * ����Ա����
 * 	���ݣ�������������Ĺ��Գ�ȡ
 * 		���� ������name ���� Id
 * 		����������work������
 */
public abstract class Employee {
	private String name;
	private String Id;
	//���幤������
	public abstract void work();
	public void setName(String name){
		this.name = name;
	}
	public void setId(String Id){
		this.Id = Id;
	}
	public String getName(){
		return name;
	}
	public String getId(){
		return Id;
	}
}
