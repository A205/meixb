package score;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
			int score=scanner.nextInt();
				
		if(score<0||score>100)
		{
			System.out.println("输入错误");
		}
		else{
			if(score>=60)
			{
				System.out.println("成绩合格");
			}
			else{
				System.out.println("成绩不合格");
			}
			
		}

	}

}
