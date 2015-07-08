package com.java.liwu.p2;

//import 用于引用包
import com.java.liwu.p1.*;//*表示的不是包里的所有类。只是需要引入的类。

public class Bsd {
	public void methodB()
	{
		Asd a=new Asd();
		a.msgA1();
	//	a.msgA2();  //msgA2()是私有的。
	//	a.msgA3();  //default方法只能是同一个包中的类才能访问。
	//	a.msgA4();  //	protected方法可在不同包中的子类直接继承，
					//	但不同包中的不同类不能引用。
	}
	
	public static void main(String[] args)
	{
		Bsd bsd=new Bsd();
		bsd.methodB();
	}
}
