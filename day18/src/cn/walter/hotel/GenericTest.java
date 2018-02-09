package cn.walter.hotel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���Ƶ�Ա������ʦ������Ա�������ֱ�洢��3��������
 * ���巽�������Ա���3�����ϣ��������ϵ�ͬʱ�����Ե��ù�������
 */
public class GenericTest {
	public static void main(String[] args) {
		//����3�����϶���
		ArrayList<ChuShi> cs = new ArrayList<ChuShi>();
		ArrayList<FuWuYuan> fwy = new ArrayList<FuWuYuan>();
		ArrayList<JingLi> jl = new ArrayList<JingLi>();
		
		//ÿ�����ϴ洢�Լ���Ԫ��
		cs.add(new ChuShi("cs1","12"));
		cs.add(new ChuShi("cs2","13"));
		fwy.add(new FuWuYuan("fwy1","12"));
		fwy.add(new FuWuYuan("fwy","13"));
		jl.add(new JingLi("jl1","12",1111));
		jl.add(new JingLi("jl2","13",1111));
		iterator(cs);
		iterator(fwy);
		iterator(jl);
//		ArrayList<String> array = new ArrayList<String>();
//		iterator(array);
	}
	/*
	 * ���巽��������ͬʱ�����������ϣ������������ϵ�ͬʱ�����Ե��ù�������
	 * ? ͨ�����������it.next����ȡ������Object���ͣ���ô����work����
	 * ǿ��ת���� it.next() = Object o ==>Employee ת�ɸ���(��̬˼��)��
	 * ������ô������ ArrayList<E>������ô��(����ȫ����)
	 * �����������������ƣ����Դ���Employee����Ҳ���Դ���Employee������Ķ���
	 * ���͵��޶����������У�����̶�Employee��������������� <?extends Employee>
	 *  ?extends Employee ���Ƶ��Ǹ��࣬�����޶�    ���Դ���Employee�����������������
	 *  ?super Employee ���Ƶ������࣬�����޶�    ���Դ���Employee���������ĸ������
	 */

	private static void iterator(Collection<?extends Employee> coll) {
		Iterator<?extends Employee> it = coll.iterator();
		while(it.hasNext()){
			//��ȡ����next() �������ͣ���ʲô Employee �������ͣ��������
			Employee em = it.next();
			System.out.println(em);
			em.work();
		}
		
	}
	
}
