package cn.walter.demo09;
/*
 * new Animal(){
			public void eat(){
				System.out.println("�ڳԷ�");
			}
			public void sleep(){
				System.out.println("��˯��");
			}
		};
	���ϴ������Animal������Ķ���
	��̬�ԣ��������� = ����Ķ���
 */
public class Test2 {
	public static void main(String[] args) {
		Animal a = new Animal(){
			public void eat(){
				System.out.println("�ڳԷ�");
			}
			public void sleep(){
				System.out.println("��˯��");
			}
		};
		a.eat();
		a.sleep();
	}
}
