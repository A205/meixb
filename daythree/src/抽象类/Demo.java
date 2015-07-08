package 抽象类;

public class Demo {
	public static void main(String[] args){
		//抽象类是不能实例化的
		//Animal animal=new Animal();//编译出错
		
		Animal animal=new Monkey();//new Tiger();
		animal.sleep();
	}
}
