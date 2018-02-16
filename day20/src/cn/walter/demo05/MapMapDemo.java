package cn.walter.demo05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵ�Ƕ�ף�Map�д洢�Ļ���Map����
 * ѧУ
 *   ����
 *   001 a
 *   002 b
 *   ���
 *   001 c
 *   002 d
 * �������ݽ��ж���洢
 * �������洢ѧ�ź������ļ�ֵ��
 * ѧУ���洢�İ༶
 * 
 * ������Map:<ѧ�ţ�����>
 * ѧУMap<�༶���ƣ�������Map>
 */
public class MapMapDemo {
	public static void main(String[] args) {
		//����༶����
		HashMap<String,String> jc = new HashMap<String,String>();
		HashMap<String,String> tg = new HashMap<String,String>();
		//�������
		jc.put("001", "a");
		jc.put("002", "b");
		tg.put("001", "c");
		tg.put("002", "d");
		//����ѧУ���������ǰ�����ֵ�ǰ༶����
		HashMap<String,HashMap<String,String>> xx = 
				new HashMap<String,HashMap<String,String>>();
		xx.put("jc", jc);
		xx.put("tg", tg);	
		//keySet(xx);
		entrySet(xx);
	}
	/*
	 * ����entrySet��������
	 */
	public static void entrySet(HashMap<String,HashMap<String,String>> xx){
		//����xx���Ϸ���entrySet��������xx���ϵļ�ֵ��ϵ���󣬴洢��Set����
		Set<Map.Entry<String, HashMap<String,String>>>  classNameSet = xx.entrySet();
		//����������Set����
		Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = 
				classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next������ȡ������xx���ϵļ�ֵ��Ӧ��ϵ����
			Map.Entry<String, HashMap<String,String>> classNameEntry = classNameIt.next();
			//classNameEntry������getKey()��getValue()
			String classNameKey = classNameEntry.getKey();
			//��ȡֵ��һ��Map����
			HashMap<String,String> classMap = classNameEntry.getValue();
			//���ð༶����classMap����entrySet����ֵ�Թ�ϵ����洢Set����
			Set<Map.Entry<String,String>> StudentSet = classMap.entrySet();
			//����Set����
			Iterator<Map.Entry<String,String>> studentIt = StudentSet.iterator();
			while(studentIt.hasNext()){
				//StudentIt����next��ȡ���ǰ༶���ϵļ�ֵ�Թ�ϵ����
				Map.Entry<String, String>studentEntry = studentIt.next();
				//classEntry����getKey()��getValue()
				String numKey = studentEntry.getKey();
				String nameValue = studentEntry.getValue();
				System.out.println(classNameKey+"..."+numKey+"..."+nameValue );
			}
		}
	}
	/*
	 * ����keySet��������
	 */
	public static void keySet(HashMap<String,HashMap<String,String>> xx){
		//����xx���Ϸ���keySet�����洢��Set����
		Set<String> classNameSet = xx.keySet(); 
		//����Set����
		Iterator<String> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next��ȡ��������Set����Ԫ�أ�xx���ϵļ�
			String classNameKey = classNameIt.next();
			//xx���ϵķ���get��ȡֵ��ֵ��һ��HasnMap����
			HashMap<String,String> classMap = xx.get(classNameKey);
			//����classMap���Ϸ���keySet�����洢��Set����
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
			while(studentIt.hasNext()){
				//stydentIt.next��ȡ��������classMap�ļ���ѧ��
				String numKey = studentIt.next();
				//����classMap�����е�get������ȡֵ
				String numValue = classMap.get(numKey);
				System.out.println(classNameKey+"..."+numKey+"..."+numValue);
			}
		}
	}
}
