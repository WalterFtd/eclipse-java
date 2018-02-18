package cn.walter.demo01;
/*
 * 异常的处理方式
 * 	try...catch...finally
 * 	格式：
 * 		try{
 * 			被检测的代码
 * 			可能出现异常的代码
 * 		}catch(异常类名 变量){
 * 			异常的处理方式
 * 			循环，判断，调用方法，变量
 * 		}finally{
 * 			必须要执行的代码
 * 		}
 */
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int[] arr = new int[0];
		//int[] arr = null;
		try{
			int i = getArray(arr); //try检测异常，抛给catch代码块
			System.out.println(i);
		}catch(NullPointerException ex){ //catch捕获了异常NullPointerException ex = new NullPointerException("数组不存在");
			System.out.println(ex);//处理异常
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex);//处理异常
		}
		System.out.println("Game over");
	}
	/*
	 * 定义方法，抛出方法
	 * 调用者使用try catch
	 */
	public static int getArray(int[] arr)throws NullPointerException,ArrayIndexOutOfBoundsException{
		//对数组判空
		if(arr == null){
			//手动抛出异常，抛出空指针异常
			throw new NullPointerException("数组不存在");//程序创建一个异常类对象并（throw）抛给调用者
		}
		//对数组的索引进行判断
		if(arr.length<3){
			//手动抛出异常，数组索引越界异常
			throw new ArrayIndexOutOfBoundsException("数组没有3索引");
		}
		return arr[3]+1;
	}
}
