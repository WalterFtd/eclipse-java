package cn.walter.demo03;
/*
 * 方法的递归
 * 	方法自己调用自己
 * 适合于,方法中运算的主体不变,但是运行的时候,参与运行的方法参数会变化
 * 注意:
 *     递归一定要有出口, 必须可以让程序停下
 *     递归次数不能过多
 *     构造方法,禁止递归
 * 
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		int sum = getSum(100);
		System.out.println(sum);
		System.out.println(getJieCheng(10));//求阶乘
		System.out.println(getFBNQ(12));
	}
	/*
	 *  方法递归,计算斐波那契数列
	 * 	从第三项开始，后面每项目，是前面两项的和
	 * 	n=n-1+n-2
	 *  n>2
	 */
	public static int getFBNQ(int mouth){
		if(mouth == 1)
			return 1;
		if(mouth == 2)
			return 1;
		return getFBNQ(mouth-1)+getFBNQ(mouth-2);
	}
	
	/* 
	 *  计算阶乘 5!
	 *   5*4*3*2*1
	 */
	public static int getJieCheng(int n){
		if(n == 1){
			return 1;
		}
		return n*getJieCheng(n-1);

	}
	/*
	 *  计算 1+2+3+100和 = 5050
	 *  计算规律:
	 *    n+(n-1)+(n-2)
	 *    100+(100-1)+(99-1)+...1
	 */
	public static int getSum(int n){
		if(n == 1){
			return 1;
		}
		return n+getSum(n-1);
	}
	
}
