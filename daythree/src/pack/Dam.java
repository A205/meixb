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
		this.name=name;//this 指当前实例对象，“我”  
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
this指当前对象  
用在构造方法内部，用来区别同名的成员变量和局部变量。
用于调用，减少代码冗余。
用于调用成员属性和成员方法。
*/