package Loops_Datatypes_IntergerPrograms;

public class palindrome 
{
	public static void main(String[] args) {
		
	
	int num = 10021213;
	int res = 0;
	
	while(num!=0)
	{
		int ld =num%10;
		res = ld+ res*10;
		num = num/10;
	}
	System.out.println(res);
	}
}
