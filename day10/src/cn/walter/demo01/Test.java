package cn.walter.demo01;
/*
 * ������
 * �̳еĺô���
 * 	1.����˴���ĸ�����
 * 	2.��������֮������˹�ϵ���ṩ�˶�̬��ǰ��
 * 
 * ע�⣺Javaֻ֧�ֵ��̳У�һ����ֻ��һ��ֱ�Ӹ���
 * 
 */
public class Test {

	public static void main(String[] args) {
		//�����з���Ա����Ķ���
		Develop d = new Develop();
		//����Ķ��󣬿��Ե��ø����еĳ�Ա
		d.name = "С��";
		d.print();
		d.work();
		
		//����ά��Ա����Ķ���
		WeiHu w = new WeiHu();
		w.name = "С��";
		w.print();
		w.work();
	}
}
