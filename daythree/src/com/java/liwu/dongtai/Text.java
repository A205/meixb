package com.java.liwu.dongtai;

public class Text {
	public static void main(String[] args){
		
		Animal animal=new Animal();
		System.out.println(animal.str);
		animal.hello();
		
		System.out.println("������������������������������������������������");
		
		Tiger tiger=new Tiger();
		System.out.println(tiger.str);
		tiger.hello();
		
		System.out.println("������������������������������������������������");
		
		Animal ani=new Tiger();
		System.out.println(ani.str);//������Ȼ���ø���ġ�
		ani.hello();//��̬�󶨡���������ָ���ʵ�����͡�����Tiger().
		
	}
}
