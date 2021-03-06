package cn.walter.demo05;
/*
 * 输出线程，对资源对象Resource中的成员变量，输出值
 */
public class Output implements Runnable{
	private Resource r;
	public Output(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
			synchronized (r) {
				//判断标记，是flase，等待
				if(!r.flag){
					try {r.wait();} catch (InterruptedException e) {}
				}
				System.out.println(r.name+"..."+r.sex);
				//标记改为false，唤醒对方线程
				r.flag = false;
				r.notify();
			}
		}
	}

}
