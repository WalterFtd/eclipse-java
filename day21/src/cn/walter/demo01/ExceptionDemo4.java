package cn.walter.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * throws ����try...catch�����ԣ������Լ����
 */
public class ExceptionDemo4 {
	public static void main(String[] args) {
		try{
			function();
		}catch(ParseException ex){
			
		}
	}

	private static void function()throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		//parse(String source) �Ӹ����ַ����Ŀ�ʼ�����ı���������һ�����ڡ�
		Date date = sdf.parse("2088-8-8");
		System.out.println(date);
	}
	
}
