package cn.walter.demo04;
//A�����B����ֻ��ͨ���������þ�̬��Ա��ã��������Լ�new����֤A����B���ڳ����е�Ψһ��
public class LockA {
	private LockA(){
		//˽�еĹ��췽���������������	
	}
	//��̬�����ǲ���Ҫ�����������static���Σ����뱻�Ķ�����final���Σ�Ȩ����public
	public static final LockA Locka = new LockA();
}
