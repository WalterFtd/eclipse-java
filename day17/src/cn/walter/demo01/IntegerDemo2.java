package cn.walter.demo01;
/*
 * JDK1.5����ֵ����ԣ��Զ�װ����Զ�����
 * �Զ�װ�䣺�����������ͣ�ֱ�ӱ�ɶ���
 * �Զ����䣺�����е��������ͱ�ػ����������� ������ѧ����
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		function3();
	}
	/*
	 * ����װ��Ͳ����һЩ��ϰ��
	 */
	public static void function3(){
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j); //==�����Ƕ���ģ���ô�Ƚϵ��Ƕ���ĵ�ֵַ
		System.out.println(i.equals(j));//�̳�Object��дequals���ȽϵĶ�������
		System.out.println("==========================");
		//��������byte��Χ�ڣ�JVM�������������new����
		Integer a = 127; //Integer a = new  Integer��127);
		Integer b = 127; //Integer b = a;
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println("==========================");
		Integer aa = 128;
		Integer bb = 128;
		System.out.println(aa == bb);
		System.out.println(a.equals(b));
	}
	//װ��Ͳ����ȱ��
	public static void function2(){
		Integer in = null;
		//in = null.intvalue+1
		in = in + 1;
		System.out.println(in);//�������ָ���쳣
	}	
	//�Զ�װ����Զ�����ĺô����ǿ���ֱ�ӽ��������ͺͰ�װ���ͽ�������
	public static void function(){
		//�������ͣ����ñ���һ��ָ�����
		//�Զ�װ�䣬������������1��ֱ�ӱ���˶���
		Integer in = 1;//�����ϣ�Integer in = new Integer(1);
		System.out.println(in);//in.toString
		
		//in ���������ͣ����ܺͻ����������㣬���������һ���Զ����䣬��������in��ת��Ϊ��������
		// in+1 ==>in.intvalue()+1 = 2 �Զ�����
		// in = 2 �Զ�װ��
		in = in +1;
	}
	//���缯��ArrayList<integer> ֻ�洢��װ����  ���÷��� add(1),������ԭ������Զ�װ��
	/*
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add<1>;
	 */
}
