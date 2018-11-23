import java.util.*;
class Primefactors 
{
	public static void main(String [] args)
	{
		System.out.println("Enter a number");
		int n,i,j,num,count=0;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			num = n;
			if(num%i==0)
			{
				for(j=1;j<=i/2;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
			}
			if(count==1)
			{
				count=0;
				System.out.println(" "+i);
			}
		}
		
	}
}
