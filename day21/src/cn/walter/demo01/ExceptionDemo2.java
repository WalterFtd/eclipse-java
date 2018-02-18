package cn.walter.demo01;

import java.util.NoSuchElementException;

/*
 * ��catchд��һ��
 * ϸ�ڣ�
 * 	catch С����д�����쳣�������
 * 	��û��˳��ĸ���	��
 * 	
 * 	ƽ���쳣���׳����쳣��֮�䣬û�м̳й�ϵ û��˳��
 * 	NullPointerException extends RuntimeException
 *  NoSuchElementException extends RuntimeException
 *  
 *  ���¼���ϵ�쳣��Խ�߼��ĸ���Խд������
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
