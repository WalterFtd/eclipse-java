package cn.walter.demo02;
/*
 * 异常分为编译异常和运行时异常
 * 	编译异常：调用了抛出异常的方法，不处理编译失败(try   throws)
 * 	运行异常：抛出的异常时RuntimeException类，或者是他的子类
 * 
 * 运行异常的特点：
 * 		抛出的是运行时异常  new  XXXException
 * 		方法的声明上,不需要throws语句,调用者，不需要处理
 * 		设计原因：
 * 			运行异常原本不会发生，如果发生了，程序人员停止程序，修改源代码
 * 			运行异常一旦发生，后面代码就没有意义了
 * 			
 * 		
 */
public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		//function();
		double d = getArea(-1);
		System.out.println(d);
	}
	/*
	 * 定义方法，计算圆形面积
	 * 传递参数0，或者负数，计算的时候问题
	 * 但是违反了真实情况
	 * 参数小于0，停止程序，不要再计算了
	 * 
	 */
	public static double getArea(int r){
		if(r < 0)
			throw new RuntimeException("圆形不存在");
		return r*r*Math.PI;
	}
	private static void function() {
		int[] arr = {1,2,3};
		//对数组的5索引进行判断，如果5索引大于100，将5索引上的数据/2.否则/3
		if(arr[5] > 100){
			arr[5] = arr[5]/2;
		}else{
			arr[5] = arr[5]/3;
		}
		throw new RuntimeException();
	}
}
