package cn.walter.abstractclass;

public class TestReturn {
	public static void main(String[] args) {
		//����GetAnimal��ķ�����getAnimal������ֵ��Animal
		GetAnimal g = new GetAnimal();
		Animal a = g.getAnimal();//�����ķ���ֵ������Animal���ͣ�return new Cat();
		a.eat();
		Animal a2 = g.getAnimal(9);
		a2.eat();
	}
}
