package cn.walter.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat类方法parse
 * 将字符串解析为日期对象
 * Date parse(String s)字符串变成日期对象
 * String => Date parse
 * Date => String foramt
 * 
 * 小问题，发生异常需要加抛出异常的代码
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws Exception {
		function();
	}
	/*
	 * 将字符串转成Date对象
	 * DateFormat类方法parse
	 * 步骤：
	 * 	1.创建SimpleDateFormat的对象
	 * 		构造方法中，指定日期模式
	 *  2.子类对象，调用方法parse 传递String，返回Date
	 *  
	 *  注意：时间和日期的模式yyyy-MM-dd，必须和字符串中的时间日期匹配
	 *  
	 *  但是，日期是用户键盘输入，日期根本不能输入
	 *  用户选择的形式---日期控件
	 */
	public static void function() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-12-12");
		System.out.println(date);
	}
}
