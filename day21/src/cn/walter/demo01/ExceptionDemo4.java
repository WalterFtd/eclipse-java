package cn.walter.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * throws 或者try...catch都可以，尽量自己解决
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
		//parse(String source) 从给定字符串的开始解析文本，以生成一个日期。
		Date date = sdf.parse("2088-8-8");
		System.out.println(date);
	}
	
}
