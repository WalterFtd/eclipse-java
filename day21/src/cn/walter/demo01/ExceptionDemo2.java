package cn.walter.demo01;

import java.util.NoSuchElementException;

/*
 * 多catch写在一起
 * 细节：
 * 	catch 小括号写的是异常类的类名
 * 	有没有顺序的概念	有
 * 	
 * 	平级异常：抛出的异常类之间，没有继承关系 没有顺序
 * 	NullPointerException extends RuntimeException
 *  NoSuchElementException extends RuntimeException
 *  
 *  上下级关系异常，越高级的父类越写在下面
 *  
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		try{
			
		}catch(NullPointerException ex){
			System.out.println(ex);
		}catch(NoSuchElementException ex){
			System.out.println(ex);
		}
	}
	public static void function(int a)throws NullPointerException,NoSuchElementException{
		if(a==0){
			throw new NullPointerException();
		}
		if(a==1){
			throw new NoSuchElementException();
		}
	}
}
