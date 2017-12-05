package cn.walter.abstractclass;

public class TestReturn {
	public static void main(String[] args) {
		//调用GetAnimal类的方法，getAnimal，返回值是Animal
		GetAnimal g = new GetAnimal();
		Animal a = g.getAnimal();//方法的返回值返回了Animal类型，return new Cat();
		a.eat();
		Animal a2 = g.getAnimal(9);
		a2.eat();
	}
}
