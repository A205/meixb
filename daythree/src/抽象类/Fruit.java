package 抽象类;

public abstract class Fruit {
}

class Apple extends Fruit{
	public String toString(){
		return"苹果";
	}
}
class Mango extends Fruit{
	public String toString(){
		return"芒果";
	}
}
class Juicer{
	public void juice(Fruit fruit){
		System.out.println("榨"+fruit+"汁");
	}
	
	public static void main(String[] args){
		Juicer j=new Juicer();
		
		Fruit fruit=new Apple();//new Mango();
		
		j.juice(fruit);
	}
	
}