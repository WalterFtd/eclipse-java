package cn.walter.hotel;

public class Test {
	public static void main(String[] args) {
		//创建1个经理，2个服务员，2个厨师
		JingLi j1 = new JingLi("罗总","董事会001",1190);
		j1.work();
		
		FuWuYuan f1 = new FuWuYuan("翠花","服务部001");
		FuWuYuan f2 = new FuWuYuan("秋香","服务部002");
		f1.work();
		f1.services();
		f2.work();
		f2.services();
		ChuShi c1 = new ChuShi("李大嘴","后厨001");
		ChuShi c2 = new ChuShi("李二嘴","后厨002");
		c1.work();
		c1.services();
		c2.work();
		c2.services();
	}
}
