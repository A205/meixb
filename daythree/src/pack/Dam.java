package pack;


public class Dam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Per per=new Per("Jim",20,"USA");
		per.introduce();
	}

}


class Per{
	String name;
	int age;
	String addr;
	public Per(){}
	public Per(String name,int age)
	{
		this.name=name;//this ָ��ǰʵ�����󣬡��ҡ�  
		this.age=age;
	}
	public Per(String name,int age,String addr)
	{
		this(name,age);
		this.addr=addr;
	}
	void introduce(){
		System.out.println(this.name);
		
	}
	
}
/*
thisָ��ǰ����  
���ڹ��췽���ڲ�����������ͬ���ĳ�Ա�����;ֲ�������
���ڵ��ã����ٴ������ࡣ
���ڵ��ó�Ա���Ժͳ�Ա������
*/