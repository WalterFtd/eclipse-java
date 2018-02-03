package cn.walter.demo01;
/*
 * JDK1.5后出现的特性，自动装箱和自动拆箱
 * 自动装箱：基本数据类型，直接变成对象
 * 自动拆箱：对象中的数据类型变回基本数据类型 ，做数学计算
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * 关于装箱和拆箱的一些练习题
	 */
	public static void function3(){
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j); //==左右是对象的，那么比较的是对象的地址值
		System.out.println(i.equals(j));//继承Object重写equals，比较的对象数据
		System.out.println("==========================");
		//当数据在byte范围内，JVM虚拟机不会重新new对象
		Integer a = 127; //Integer a = new  Integer（127);
		Integer b = 127; //Integer b = a;
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println("==========================");
		Integer aa = 128;
		Integer bb = 128;
		System.out.println(aa == bb);
		System.out.println(a.equals(b));
	}
	//装箱和拆箱的缺点
	public static void function2(){
		Integer in = null;
		//in = null.intvalue+1
		in = in + 1;
		System.out.println(in);//会产生空指针异常
	}	
	//自动装箱和自动拆箱的好处就是可以直接将基本类型和包装类型进行运算
	public static void function(){
		//引用类型，引用变量一定指向对象
		//自动装箱，基本数据类型1，直接变成了对象
		Integer in = 1;//本质上：Integer in = new Integer(1);
		System.out.println(in);//in.toString
		
		//in 是引用类型，不能和基本类型运算，所以这边有一个自动拆箱，引用类型in，转换为基本类型
		// in+1 ==>in.intvalue()+1 = 2 自动拆箱
		// in = 2 自动装箱
		in = in +1;
	}
	//例如集合ArrayList<integer> 只存储包装类型  调用方法 add(1),不出错原因就是自动装箱
	/*
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add<1>;
	 */
}
