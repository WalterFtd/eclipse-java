package cn.walter.demo09;
/*
 * 匿名内部类必须继承父类或者实现接口才能用，只能用在方法中
 */
public interface Smoking {
	//接口中使用抽象方法
	public abstract void smoking();
}
/*
 * 实现类，实现接口 重写接口抽象方法，创建实现类的对象
 * class XXX implement Smoking{
 * 		public void smoking(){
 * 		
 * 		}
 * }
 * XXX x = new XXX();
 * x.smoking();
 * 
 * 匿名内部类，简化问题： 定义实现类，重写方法，建立实现类对象，合为一步完成
 */