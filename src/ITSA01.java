import java.util.Scanner;

public class ITSA01 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		int n,i;
		int sum = 1,tem,a=0;	
		n=keybord.nextInt();
		if (n==1)sum=1;
		else
		{
			for(i=2;i<=n;i++)
			{
				tem=sum;
				sum=sum+a;
				a=tem;
				
			}
		}
		//sum=(n-1)+(n-2);
		System.out.println(sum);

	}

}
