package pack;

public class Phone {
	
	//����
	String name;
	String brand;
	int price;
	
	//��Ϊ ��������
	//void  �����ķ�������
	void call()
	{
		System.out.println("��绰������");
	}
	void sendMsg()
	{
		System.out.println("�����š�����");
	}
	
	
	public static void main(String[]args)
	{
		//ʵ����һ���ֻ�
		Phone phone=new Phone();
		phone.name="���׻�";
		phone.brand="baidu";
		phone.price=99;
		
		System.out.println(phone.name+"\n"+phone.brand+"\n"+phone.price);
		phone.call();
	}
}

