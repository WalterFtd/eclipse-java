package cn.walter.hotel;
/*
 * �Ƶ��Ա����
 * 	Ա�����ԣ����������ţ���������
 */
public abstract class Employee {
	private String name;
	private String id;
	//�ṩ���׹��췽��
	//һ�׿ղΣ�һ���в���
	public Employee(){
		
	}
	
	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	//���幤������
	public abstract void work();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
