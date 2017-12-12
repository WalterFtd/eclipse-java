package cn.walter.demo01;

public class RegexDemo3 {
	public static void main(String[] args) {
		checkMail();
	}
	/*
	 * 检查邮箱地址是否合法
	 * 规则：
	 * 1234567@qq.com
	 * mus_sds@163.com
	 * djfndjn@yahoo.com.cn
	 * 
	 * @：前数字字母_ 个数不少于1个
	 * @：后数字字母      个数不少于1个
	 * .后面字母
	 */
	public static void checkMail(){
		String email = "asas13@sdks.com.cn";
		boolean b = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}
}
