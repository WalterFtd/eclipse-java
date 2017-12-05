package cn.walter.classes;
/*
 * 类作为方法参数与返回值
 */
public class TestReturn {
	public static void main(String[] args) {
		//调用GetPerson类的方法get
		//返回值是Person类型
		GetPerson g = new GetPerson();
		//通过返回值来得到新建的person类对象
		Person p = g.get();
		p.eat();
		p.run();
		
		//new GetPerson().get().eat(); 函数调用链
	}
}
