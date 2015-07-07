package daytwo;

public class zhishu {
	public static void main(String args[]){ 
		for(int i=2,j;i<=99;i++){ 
		int k=(int)Math.sqrt(i); 
		for(j=2;j<=k;j++){ 
		if(i%j==0){ 
		break; 
		} 
		} 
		if(j>k){ 
		System.out.println(i); 
		} 
		} 
		} 
		}