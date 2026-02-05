package String;

public class removeDuplicatesfromSTring 
{
	public static void main(String[] args) {
		String s= "Programming";
		
		char c ='m';
		String res = "";
		
		for(int i=0; i<=s.length()-1; i++)
		{
			if(!(s.charAt(i)==c))
			{
				res = res +s.charAt(i);
			}
		}
		System.out.println(res);
	}
}
