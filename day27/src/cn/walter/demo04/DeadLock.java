package cn.walter.demo04;

public class DeadLock implements Runnable{
	private int i = 0;
	public void run(){
		while(true){
			//���߳��ڷ�������
			if(i%2==0){
				//�Ƚ���Aͬ�����ٽ���Bͬ��
				synchronized (LockA.Locka) {
					System.out.println("if...locka");
					synchronized (LockB.lockb) {
						System.out.println("if...lockb");
					}
				}
			}else{
				//�Ƚ���Bͬ�����ٽ���Aͬ��
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
