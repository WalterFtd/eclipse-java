package cn.walter.demo04;
/*
 * �Զ����쳣
 * ֻ���쳣��ž��п�����
 * �̳�Exception�����߼̳�RuntimeException
 * ���췽����,super���쳣��Ϣ���ݸ����༴��
 */
public class FuShuException extends RuntimeException {
	public FuShuException (){}
	public FuShuException (String s){
		super(s);
	}
}
