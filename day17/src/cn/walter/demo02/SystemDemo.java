package cn.walter.demo02;

public class SystemDemo {
	public static void main(String[] args) {
		function_4();
	}
	/* System����    ��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
	 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
	 * Object src, Ҫ���Ƶ�Դ����
	 * int srcPos, ����Դ����ʼ����
	 * Object dest, ���ƺ��Ŀ������
	 * int destPos, Ŀ��������ʼ����
	 * int length, ���Ƽ���
	 */
	public static void function_4(){
		//native��ʾ���أ�����windows�Ĺ���ȥ������鸴�ƣ����ط����������Ƕ��Ǳ��ܵģ�����Դ�ģ����ò���ϵͳ��ɹ���
		//����ʱ�ߵ��ڴ�б��ط���ջ
		int[] src = {11,22,33,44,55};
		int[] desc = {77,88,99,66};
		System.arraycopy(src, 1, desc, 1, 2);
		for(int i = 0;i<desc.length;i++){
			System.out.println(desc[i]);
		}
	}
	/*
	 * ��ȡ��ǰ����ϵͳ������
	 * static Properties getProperties()
	 * �����ķ���ֵProperties��һ�����������һ���࣬��ArrayList���
	 */
	public static void function_3(){
		System.out.println(System.getProperties());
	}
	/*
	 * JVM���ڴ��У���ȡ���������
	 * static void gc()
	 */
	public static void function_2(){
		//��������,һ��������Ͷ�
		new Person();
		new Person();
		new Person();
		//�����������ʱ��������еķ���finalize
		System.gc();
	}
	/*
	 * �˳�����������ó�����ֹ
	 * static void exit(0);���ݹ������� 0 ��״̬���ʾ�쳣��ֹ��
	 */
	public static void function_1(){
		while(true){
			System.out.println("hello");
			System.exit(0);
		}
	}
	/*
	 * ��ȡϵͳ��ǰ�ĺ���ֵ
	 * start long currentTimeMillis()
	 * �Գ���ִ��ʱ�����
	 */
	public static void function(){
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
