package cn.walter.demo09;
/*
 * �����ڲ������̳и������ʵ�ֽӿڲ����ã�ֻ�����ڷ�����
 */
public interface Smoking {
	//�ӿ���ʹ�ó��󷽷�
	public abstract void smoking();
}
/*
 * ʵ���࣬ʵ�ֽӿ� ��д�ӿڳ��󷽷�������ʵ����Ķ���
 * class XXX implement Smoking{
 * 		public void smoking(){
 * 		
 * 		}
 * }
 * XXX x = new XXX();
 * x.smoking();
 * 
 * �����ڲ��࣬�����⣺ ����ʵ���࣬��д����������ʵ������󣬺�Ϊһ�����
 */