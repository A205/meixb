package pack;

public class Fruit {

	String name;
	int price;
	String addr;
	
	//�в����Ĺ��췽��
	Fruit(String n,int p,String a)
	{
		name=n;
		price=p;
		addr=a;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit("��÷",12,"����");
		System.out.println(f.name);
		System.out.println(f.price);
		System.out.println(f.addr);
	}

}
