package cn.walter.demo03;

/*
 * �����Hashֵ����ͨ��ʮ��������
 * ����Object������public int hashCode() ������int����
 */
public class HashDemo {
	public static void main(String[] args) {
		Person p = new Person();
		//�������Ԥ֪,�����hashֵ
		int i = p.hashCode();
		System.out.println(i);
		
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
