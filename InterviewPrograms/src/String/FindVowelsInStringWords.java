package String;

public class FindVowelsInStringWords {
	public static void main(String[] args) {
		String s= "I Like Java Language with good knoweldge in programming";
		
		
		String [] arr= s.split(" ");
		
		for(int i =0; i<=arr.length-1; i++)
		{
			String s1 = arr[i];
			int count=0;
			for(int j=0; j<=s1.length()-1; j++)
			{
				if(s1.toLowerCase().charAt(j)=='a' || s1.toLowerCase().charAt(j)=='e' || s1.toLowerCase().charAt(j)=='i' ||
						s1.toLowerCase().charAt(j)=='o' ||s1.toLowerCase().charAt(j)=='u')
				{
					count++;
				}
					
			}
			System.out.println(arr[i]+"=" + count);
		}
		
		
	}
}
