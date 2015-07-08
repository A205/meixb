package com.java.liwu.p1;

public class Asd {
	
	//访问修饰符public在包p2中调用。
	public void msgA1()
	{
		System.out.println("输出方法A1");
	}
	
	//访问修饰符private在包p2中调用。
	private void msgA2()
	{
		System.out.println("输出方法A2");
	}
	
	//访问修饰符default在包p2中调用。
	void msgA3()
	{
		System.out.println("输出方法A3");
	}
	
	//访问修饰符protected在包p2中调用。
	protected void msgA4()
	{
		System.out.println("输出方法A4");
	}
}
