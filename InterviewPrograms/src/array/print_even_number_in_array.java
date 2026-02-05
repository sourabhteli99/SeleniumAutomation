package array;

public class print_even_number_in_array 
{
	public static void main(String[] args) {
		int arr[]= {2,4,6,7, 3, 1, 8, 10, 321};
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
