package cn.walter.demo05;
/*
 * ����̣߳�����Դ����Resource�еĳ�Ա���������ֵ
 */
public class Output implements Runnable{
	private Resource r;
	public Output(Resource r){
		this.r = r;
	}
	public void run(){
		while(true){
			synchronized (r) {
				//�жϱ�ǣ���flase���ȴ�
				if(!r.flag){
					try {r.wait();} catch (InterruptedException e) {}
				}
				System.out.println(r.name+"..."+r.sex);
				//��Ǹ�Ϊfalse�����ѶԷ��߳�
				r.flag = false;
				r.notify();
			}
		}
	}

}
