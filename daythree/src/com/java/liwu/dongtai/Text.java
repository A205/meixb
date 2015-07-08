package com.java.liwu.dongtai;

public class Text {
	public static void main(String[] args){
		
		Animal animal=new Animal();
		System.out.println(animal.str);
		animal.hello();
		
		System.out.println("························");
		
		Tiger tiger=new Tiger();
		System.out.println(tiger.str);
		tiger.hello();
		
		System.out.println("························");
		
		Animal ani=new Tiger();
		System.out.println(ani.str);//属性依然调用父类的。
		ani.hello();//动态绑定。运行其所指向的实际类型。即是Tiger().
		
	}
}
