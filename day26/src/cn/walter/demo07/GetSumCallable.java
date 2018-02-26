package cn.walter.demo07;

import java.util.concurrent.Callable;

public class GetSumCallable implements Callable<Integer>{
	//接口抽象方法不能写参数，但可以改构造方法
	private int a;
	public GetSumCallable(int a){
		this.a = a;
	}
	public Integer call(){
		int sum = 0;
		for (int i = 1; i <=a; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
