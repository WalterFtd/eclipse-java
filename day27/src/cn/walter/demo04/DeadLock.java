package cn.walter.demo04;

public class DeadLock implements Runnable{
	private int i = 0;
	public void run(){
		while(true){
			//在线程内反复抢锁
			if(i%2==0){
				//先进入A同步，再进入B同步
				synchronized (LockA.Locka) {
					System.out.println("if...locka");
					synchronized (LockB.lockb) {
						System.out.println("if...lockb");
					}
				}
			}else{
				//先进入B同步，再进入A同步
				synchronized (LockB.lockb) {
					System.out.println("else...lockb");
					synchronized (LockA.Locka) {
						System.out.println("else...locka");
					}
				}
			}
			i++;
		}
	}
}
