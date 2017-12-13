package cn.walter.demo02;
/*
 * String����ϰ
 * StringBuffer����ɱ�����ĸ���
 */
public class StringDemo6 {
	public static void main(String[] args) {
		getCount("bjsNDVSJ5454");
		System.out.println(toConvert("dscsSVS"));
		System.out.println(getStringCount("wodtod","od"));
	}
	/*
	 * ��ȡһ���ַ����У���һ���ַ������ֵĴ���
	 * ˼�룺
	 * 1.indexOf���ַ����е���һ�γ��ֵ�����
	 * 2.�ҵ�������+���ҵ��ַ������ȣ���ȡ�ַ���
	 * 3.������++
	 */
	public static int getStringCount(String str, String key){
		//���������
		int count = 0;
		//�������������indexOf���Һ���������
		int index = 0;
		//��ʼ�������ң�������indexOf ==-1 �ַ�����û����
		while((index = str.indexOf(key))!= -1){
			count++;
			//��ȡ�������������ַ���������ͣ���ȡ�ַ���
			str = str.substring(index+key.length());
		}
		return count;
	}
	/*
	 * ���ַ���������ĸת�ɴ�д����������ת��Сд
	 * ˼�룺
	 * ��ȡ����ĸ��charAt(0) substring(0,1)
	 * ת�ɴ�дtoUpperCase()
	 * 
	 * ��ȡʣ���ַ�����substring(1) toLowweCase();
	 */
	public static String toConvert(String str){
		//�����������������ĸ����ʣ���ַ�
		String first = str.substring(0,1);
		String after = str.substring(1);
		//����String�෽������д��Сдת��
		first = first.toUpperCase();
		after = after.toLowerCase();
		return first+after;
	}

	/*
	 * ��ȡָ���ַ����У���д��ĸ��Сд��ĸ�����ֵĸ��� ˼�룺 1.������������int����������һ������++
	 * 2.�����ַ��������ȷ���length()+charAt()���� 3.�ַ��ж��Ǵ�д����Сд����������
	 */
	public static void getCount(String str){
		//������������������
		int upper = 0;
		int lower = 0;
		int digit = 0;
		//���ַ�������
		for(int i = 0;i<str.length();i++){
			//String����charAt,��������ȡ�ַ�
			char c = str.charAt(i);
			//���ñ����65-90 97-122 48-57 ,Ҳ������A-Z��a-z,0-9
			if(c >=65 && c <= 90){
				upper++;
			}else if(c >= 97&& c <= 122){
				lower++;
			}else if(c >= 48&& c <= 57){
				digit++;
			}
		}
		System.out.println("��д��"+upper+" Сд��"+lower+" ���֣�"+digit);
	}
}