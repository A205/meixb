package com.java.liwu.p2;

//import �������ð�
import com.java.liwu.p1.*;//*��ʾ�Ĳ��ǰ���������ࡣֻ����Ҫ������ࡣ

public class Bsd {
	public void methodB()
	{
		Asd a=new Asd();
		a.msgA1();
	//	a.msgA2();  //msgA2()��˽�еġ�
	//	a.msgA3();  //default����ֻ����ͬһ�����е�����ܷ��ʡ�
	//	a.msgA4();  //	protected�������ڲ�ͬ���е�����ֱ�Ӽ̳У�
					//	����ͬ���еĲ�ͬ�಻�����á�
	}
	
	public static void main(String[] args)
	{
		Bsd bsd=new Bsd();
		bsd.methodB();
	}
}
