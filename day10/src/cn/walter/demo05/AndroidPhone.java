package cn.walter.demo05;
/*
 * ����õ������ֻ���
 * 	���ܣ���绰��������
 * 	 ������ʾ�����룬��������ͷ��
 * 
 * �����������ֻ�����������û�б仯��ֻ�����繦�ܷ����仯
 * ֱ��ʹ��ԭ���ֻ��Ĵ�绰�ͷ����Ŷ���
 * �µĹ�����������ʹ�ͷ��
 * 
 * �µ��ֻ����̳�ԭ�����ֻ���ֱ��ʹ��Phone��Ĵ�绰�ͷ����Ź���
 * ���ǣ���ԭ�ȵ����繦�ܣ�������д�������µĹ���
 * 
 * Ҫ�������Ȩ�޴��ڵ��ڸ���
 * �Ĵ�Ȩ��: public  protected default private
 */
public class AndroidPhone extends Phone {
	public void showNum(){
		//�����еķ���showNum�Ѿ����Ժ��룬����ֱ����
		super.showNum();
		System.out.println("�������");
		System.out.println("��Ӵ�ͷ��");
	}
}
