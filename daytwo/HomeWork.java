
public class HomeWork {
    public static void main(String[] agre) {
    	double[][] score = new double[5][20];//定义存储每个同学每门课成绩数组
    	double[] sum = new double[20];//定义存储每个同学总成绩数组
    	double[] sum1 = new double [5];//定义存储每门课总成绩数组
    	double[] ave = new double [20];//定义存储每门课平均成绩数组
		int i,j;
		//给出学生的随机成绩
		for (i = 0;i < 5;i++)
		{
		    for (j = 0;j<20;j++) 
		    {
		    	score[i][j] = (int)(0+Math.random()*(100-0+1)) ;
//		    	double tmp = (int)(0+Math.random()*(100-0+1));
//		    	System.out.println(tmp);
			}
		}
		//输出每个学生的成绩
		System.out.println("每个学生的成绩：");
		for (j = 0;j<20;j++)
		{
		    for (i = 0;i < 5;i++) 
		    {
		    	System.out.print(score[i][j]+" ");
		    }
		        System.out.println();
	    }
		//输出每个学生的总成绩
		System.out.println("每个学生的总成绩");
		for (j = 0;j<20;j++)
		{
		    for (i = 0;i < 5;i++) 
		    {
		    	sum[j] = sum[j] + score[i][j];
		    }
		    System.out.println(sum[j]);
        }
		//输出某门课的平均成绩
		System.out.println("某门课的平均成绩：");
		for (i = 0;i < 5;i++)
		{
		    for (j = 0;j < 20;j++) 
		    {
		    	sum1[i] = sum1[i] + score[i][j];
		    }
		    ave[i] = sum1[i]/20;
		    System.out.println(ave[i]);
        }
}
}
