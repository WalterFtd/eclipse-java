package cn.walter.demo08;
/*
 * ����Ա������
 * 
 * С֪ʶ��
 * super.��Ա����;���ø���ĳ�Ա����
 * super.(����);���ø���Ĺ��췽��
 * super.��Ա����();���ø���ĳ�Ա����
 */
public class Test {
	public static void main(String[] args) {
		//����EE���󣬵��÷���
		JavaEE j = new JavaEE("С��", "j001");
		j.work();
		//����net���󣬵��÷���
		Net n = new Net("С��", "n001");
		n.work();
	}
}
