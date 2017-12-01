package cn.walter.demo09;

public class Computer {
	public void openComputer(){
		System.out.println("笔记本开机");
	}
	public void closeComputer(){
		System.out.println("笔记本关机");
	}
	//使用USB设备方法，那个设备
	//方法的参数，就是USB设备--通过多态的思想来调用外部设备
	//参数是接口类型，那么可以调用任意的实现类，理论上是无限的
	public void useUSB(USB usb){
		//调用的是实现类的重写
		usb.open();
		usb.close();
	}
}
