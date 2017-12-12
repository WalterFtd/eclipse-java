package cn.walter.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat�෽��parse
 * ���ַ�������Ϊ���ڶ���
 * Date parse(String s)�ַ���������ڶ���
 * String => Date parse
 * Date => String foramt
 * 
 * С���⣬�����쳣��Ҫ���׳��쳣�Ĵ���
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws Exception {
		function();
	}
	/*
	 * ���ַ���ת��Date����
	 * DateFormat�෽��parse
	 * ���裺
	 * 	1.����SimpleDateFormat�Ķ���
	 * 		���췽���У�ָ������ģʽ
	 *  2.������󣬵��÷���parse ����String������Date
	 *  
	 *  ע�⣺ʱ������ڵ�ģʽyyyy-MM-dd��������ַ����е�ʱ������ƥ��
	 *  
	 *  ���ǣ��������û��������룬���ڸ�����������
	 *  �û�ѡ�����ʽ---���ڿؼ�
	 */
	public static void function() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse("2017-12-12");
		System.out.println(date);
	}
}
