package cn.walter.demo01;
/*
 * ����ӿ�
 * 	ʹ�ùؼ��� interface �ӿ�����
 * �ӿڶ��壺
 * 	��Ա������ȫ����
 * 	���ܶ�����з�����ķ���
 * 
 * ������󷽷����̶���ʽ
 * 
 * public abstrate ����ֵ���� �������֣������б���
 * ���η�public д�����߲�д������public
 * 
 * �ӿ��г�Ա�����Ķ���
 *	��Ա�����Ķ��壬����Ҫ��
 *
 *	Ҫ�󣺱��붨��Ϊ����
 *	�̶���ʽ��
 *		public static final �������� ������  = ֵ
 * 
 */
public interface MyInterface {
	//static ��̬�� final ���յģ��������޸�
	public static final int a = 1;
	//�ڽӿ��У��������ķ���
	public abstract void function();
}
