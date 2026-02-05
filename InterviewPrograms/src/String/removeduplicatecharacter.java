package String;

public class removeduplicatecharacter {
	public static void main(String[] args) {
		String s = "java is a Programming language";
		String res = "";
		
		for(int i =0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(!(s.contains(c+"")));
			{
				res = res+c;
			}
		}
		System.out.println(res);
	}
}
