package cn.walter.demo09;

public class Computer {
	public void openComputer(){
		System.out.println("�ʼǱ�����");
	}
	public void closeComputer(){
		System.out.println("�ʼǱ��ػ�");
	}
	//ʹ��USB�豸�������Ǹ��豸
	//�����Ĳ���������USB�豸--ͨ����̬��˼���������ⲿ�豸
	//�����ǽӿ����ͣ���ô���Ե��������ʵ���࣬�����������޵�
	public void useUSB(USB usb){
		//���õ���ʵ�������д
		usb.open();
		usb.close();
	}
}
