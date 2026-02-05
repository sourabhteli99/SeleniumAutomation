package String;

public class reverse {
	public static void main(String[] args) {
		String s ="String Builder is class in java";
		String arr [] = s.split(" ");

		String res="";

		for(int i =0; i<=arr.length-1; i++)
		{
			if (i%2==0)
			{
				res ="";
				for(int j =0; j<= arr[i].length()-1; j++)
				{
					char c = arr[i].charAt(j);
					res = c + res;

				}
				arr[i]= res;
			}
		}
		
		for(int i=0; i <=arr.length-1; i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
	}
}
