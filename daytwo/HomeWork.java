
public class HomeWork {
    public static void main(String[] agre) {
    	double[][] score = new double[5][20];//����洢ÿ��ͬѧÿ�ſγɼ�����
    	double[] sum = new double[20];//����洢ÿ��ͬѧ�ܳɼ�����
    	double[] sum1 = new double [5];//����洢ÿ�ſ��ܳɼ�����
    	double[] ave = new double [20];//����洢ÿ�ſ�ƽ���ɼ�����
		int i,j;
		//����ѧ��������ɼ�
		for (i = 0;i < 5;i++)
		{
		    for (j = 0;j<20;j++) 
		    {
		    	score[i][j] = (int)(0+Math.random()*(100-0+1)) ;
//		    	double tmp = (int)(0+Math.random()*(100-0+1));
//		    	System.out.println(tmp);
			}
		}
		//���ÿ��ѧ���ĳɼ�
		System.out.println("ÿ��ѧ���ĳɼ���");
		for (j = 0;j<20;j++)
		{
		    for (i = 0;i < 5;i++) 
		    {
		    	System.out.print(score[i][j]+" ");
		    }
		        System.out.println();
	    }
		//���ÿ��ѧ�����ܳɼ�
		System.out.println("ÿ��ѧ�����ܳɼ�");
		for (j = 0;j<20;j++)
		{
		    for (i = 0;i < 5;i++) 
		    {
		    	sum[j] = sum[j] + score[i][j];
		    }
		    System.out.println(sum[j]);
        }
		//���ĳ�ſε�ƽ���ɼ�
		System.out.println("ĳ�ſε�ƽ���ɼ���");
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
