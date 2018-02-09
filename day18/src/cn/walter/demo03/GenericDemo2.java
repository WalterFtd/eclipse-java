package cn.walter.demo03;
/*
 * 带泛型的接口
 * 
 * public interface List <E>{
 *  abstract boolean add(E e)；
 * }
 * 实现类，先实现接口，不理会泛型
 * public class ArrayList<E> Implement List<E>{
 * }
 * 这样做方便的调用者：new ArrayList<String>() 后期创建集合对象的时候，指定数据类型
 * (数据类型的指定交给调用者)
 * 实现类在实现接口的同时，就指定了数据类型
 * public class XXX implements List<String>{
 * }
 * new XXX();
 * 
 */
public class GenericDemo2 {
	public static void main(String[] args) {
		
	}
}

