package cn.walter.abstractclass;

public class GetAnimal {
	/*
	 * ���巽���������ķ���ֵ��Animal����
	 * �����࣬������û�ж���ģ�����ڷ�����return�󣬷���Animal ������Ķ���
	 */
	public Animal getAnimal(){
		return new Cat();
	}
	public Animal getAnimal(int i){
		if(i==0)
		 return new Cat();
		return new Dog();
	}
}
