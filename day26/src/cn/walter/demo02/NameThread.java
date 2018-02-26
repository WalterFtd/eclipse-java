package cn.walter.demo02;
/*
 *  获取线程名字,父类Thread方法
 *    String getName()
 *    (非静态的)
 */
public class NameThread extends Thread{
	public NameThread(){
		super("dsds");
	}
	public void run(){
		//通过父类方法获取名字
		System.out.println(super.getName());
	}
}
