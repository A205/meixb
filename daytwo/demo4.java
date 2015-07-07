package hgya;
import java.util.Scanner;
public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("«Î ‰»Î––∫≈£∫");
int num = input.nextInt();

for(int i=1;i<=num;i++){
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
}

	}

}
