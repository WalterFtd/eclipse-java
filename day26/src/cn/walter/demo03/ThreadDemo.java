package cn.walter.demo03;
/*
 * sleep(long millis) 
          ��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У����˲����ܵ�ϵͳ��ʱ���͵��ȳ��򾫶Ⱥ�׼ȷ�Ե�Ӱ�졣
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
