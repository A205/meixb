package pack;

public class Person {
		
		String name;
		int age;
		String address;
	
		void introduce()
		{
			System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ�����"+address);
		}
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();//ʵ����һ��person����
		person.name="����";
		person.age=20;
		person.address="USA";
		
		person.introduce();
		
		
	}

}
