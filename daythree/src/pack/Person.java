package pack;

public class Person {
		
		String name;
		int age;
		String address;
	
		void introduce()
		{
			System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，我在"+address);
		}
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();//实例化一个person对象
		person.name="张三";
		person.age=20;
		person.address="USA";
		
		person.introduce();
		
		
	}

}
