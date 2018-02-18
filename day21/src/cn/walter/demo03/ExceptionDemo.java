package cn.walter.demo03;
/*
 * 继承后，在子类重写父类方法的时候，异常处理
 * 结论：
 * 父类的方法，如果抛出了异常，子类重写后  ：
 * 可以不抛出异常，
 * 也可以抛出异常，但异常不能小于父类的异常（继承关系）
 * 
 * 父类没有异常，子类不能抛
 * 子类中调用了抛出异常的方法，子类只能try..catch,不能抛异常
 */
public class ExceptionDemo {
	Fu f = new Zi();
}
class Fu{
	public void function()throws Exception{
		
	}
}
class Zi extends Fu{
	public void function(){
		
	}
	
}
