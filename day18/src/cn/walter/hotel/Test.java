package cn.walter.hotel;

public class Test {
	public static void main(String[] args) {
		//����1������2������Ա��2����ʦ
		JingLi j1 = new JingLi("����","���»�001",1190);
		j1.work();
		
		FuWuYuan f1 = new FuWuYuan("�仨","����001");
		FuWuYuan f2 = new FuWuYuan("����","����002");
		f1.work();
		f1.services();
		f2.work();
		f2.services();
		ChuShi c1 = new ChuShi("�����","���001");
		ChuShi c2 = new ChuShi("�����","���002");
		c1.work();
		c1.services();
		c2.work();
		c2.services();
	}
}
