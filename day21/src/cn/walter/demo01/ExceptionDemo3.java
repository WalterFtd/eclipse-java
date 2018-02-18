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
 * 		finally，无论程序是否有异常实现，都要执行（除非结束虚拟机）System.exit(0);
 * 		释放资源
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		try{
		function(1);
		}catch(Exception ex){
			System.out.println(ex);
			//System.exit(0);
		}finally{
			System.out.println("这里代码必须执行");
		}
	}

	private static void function(int a)throws Exception {
		if( a==1){
			throw new Exception();
		} 
		System.out.println(a);
	}
	
}
