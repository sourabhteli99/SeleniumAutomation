package String;

public class test 
{
	public static void main(String[]args)
	{
		int num = 12;
		int sum = 0;
		int count = 0;
		int prod =1;
		while(num!=0)
		{
			int ld= num%10;
			System.out.println(ld);
			sum =sum+ld;
			prod = prod*ld;
			num = num/10;
		}
		System.out.println(sum);
		System.out.println(prod);
		
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if (count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		int a=50;
		int count1=0;
		
		for(int i =1; i<a; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count1++;
					System.out.println(j);
				}
			}	
		}
	}
}
