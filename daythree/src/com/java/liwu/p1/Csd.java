package com.java.liwu.p1;

public class Csd {

	public void methodC()
	{
		Asd a=new Asd();
		a.msgA3(); //dafault方法在同一包中引用。
	}
	
	public static void main(String[] args)
	{
		Csd c=new Csd();
		c.methodC();
	}
}
