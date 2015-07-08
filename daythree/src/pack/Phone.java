package pack;

public class Phone {
	
	//属性
	String name;
	String brand;
	int price;
	
	//行为 （方法）
	//void  方法的返回类型
	void call()
	{
		System.out.println("打电话···");
	}
	void sendMsg()
	{
		System.out.println("发短信···");
	}
	
	
	public static void main(String[]args)
	{
		//实例化一个手机
		Phone phone=new Phone();
		phone.name="爆米花";
		phone.brand="baidu";
		phone.price=99;
		
		System.out.println(phone.name+"\n"+phone.brand+"\n"+phone.price);
		phone.call();
	}
}

