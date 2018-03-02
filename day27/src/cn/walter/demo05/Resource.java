package cn.walter.demo05;
/*
 * 定义2资源文件夹，有2个成员变量
 * name，sex
 * 同时有两个线程，对资源中的变量操作
 * 1对name，age赋值
 * 2对name，age做变量的输出操作
 */
public class Resource {
	public String name;
	public String sex;
	public boolean flag = false;	
}

