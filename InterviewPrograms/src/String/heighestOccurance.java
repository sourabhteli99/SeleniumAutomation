package String;

import java.util.Scanner;

public class heighestOccurance 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char s1 = sc.next().charAt(0);
		System.out.println(s1);
		String s= "abaskfrikfjangaataudtayataannakda";
		
		for(int i =0; i<=s.length()-1; i++)
		{
			int count=0;
			for(int j =0; j<=s.length()-1; j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			System.out.println("occurance of "+s.charAt(i)+ " is : "+count);
		}
	}
}
