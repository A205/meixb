package ������;

//2��һ����������г��󷽷�����������ǳ����ࡣ
public abstract class Animal {
		//1��abstract���η�����ʾ��������ǳ��󷽷���
		public abstract void sleep();
}


//����̳г����࣬����ʵ�ָ����е����г��󷽷�����������Ҳ�ǳ���ġ�
//abstract class Tiger extends Animal{
class Tiger extends Animal
{
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("ſ��˯������");
	}
}

class Monkey extends Animal
{

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("����˯������");
	}
}
//ĳ�����ǳ����࣬�������ڿ���û�г��󷽷���
