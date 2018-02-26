package cn.walter.demo03;
/*
 * sleep(long millis) 
          在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 */
public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		/*for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}*/
		new SleepThread().start();
	}
}
