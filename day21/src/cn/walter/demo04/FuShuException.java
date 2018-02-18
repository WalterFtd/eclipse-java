package cn.walter.demo04;
/*
 * 自定义异常
 * 只有异常类才具有可抛性
 * 继承Exception，或者继承RuntimeException
 * 构造方法中,super将异常信息传递给父类即可
 */
public class FuShuException extends RuntimeException {
	public FuShuException (){}
	public FuShuException (String s){
		super(s);
	}
}
