package cn.walter.demo01;
/*
 * 异常中的关键字
 * 	throw，在方法内部，抛出异常的对象
 * 	throw 后面，必须写new 对象，必须是异常的对象，必须是Exception或者子类  只有异常才能抛
 * 
 * 方法中声明异常关键字
 * 	throws 用于在方法的声明上，标明此方法，可能出出现异常
 * 	请调用者处理
 * 	throws 后面必须写异常类的类名
 * 
 * 	调用了一个抛出异常的方法，调用者就必须处理
 *  不处理，就编译失败
 */
public class ExceptionDemo {
	public static void main(String[] args)throws Exception {
		int[] arr = null;
		//int[] arr = {};
		int i =getArray(arr);
		System.out.println(i);
	}
	/*
	 * 对数组的最后的索引*2，返回
	 */
	public static int getArray(int[] arr) throws Exception{
		//判断方法参数进行合法性的判断，进行判断是不是null
		if(arr == null){
			//抛出异常的形式，告诉调用者
			//关键字 throw  只能写在方法内部
			//Exception(String message)  构造带指定详细消息的新异常。
			throw new Exception("传递数组不存在");//手动抛出了异常，
		}
		//对数组进行判断，判断数组中是否有元素
		if(arr.length ==0){
			//抛出异常的形式告诉调用者，数组中没有元素
			throw new Exception("数组中没有任何元素");
		}
		int i = arr[arr.length-1];
		return i*2;
	}
}
