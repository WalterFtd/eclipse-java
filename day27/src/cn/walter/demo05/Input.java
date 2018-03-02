package cn.walter.demo05;
/*
 *  ������߳�,����Դ����Resource�г�Ա������ֵ
 *  һ�θ�ֵ ����,��
 *  ��һ�θ�ֵ lisi,nv
 */
public class Input implements Runnable{
	private Resource r;
	
	public Input (Resource r){
		this.r = r;
	}
	
	public void run(){
		int i = 0;
		while(true){
			synchronized (r) {
				//���Ϊtrue�ȴ�
				if(r.flag){
					try {r.wait();} catch (InterruptedException e) {}
				}
				if(i%2==0){
					r.name = "����";
					r.sex ="��";
				}else{
					r.name = "lisi";
					r.sex = "nv";
				}
				//���Է��̻߳��ѣ���Ǹ�Ϊtrue
				r.flag = true;
				r.notify();
			}
			i++;
		}
	}
}