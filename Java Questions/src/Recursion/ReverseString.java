package Recursion;

public class ReverseString {
	public static void main(String[] str)
	{
		
		String s= "ABCDE";
		char arr[]= s.toCharArray();
		
		char[] ch= reverse(arr, 0, s.length()-1);
		String actual= String.valueOf(ch);
		System.out.println(actual);
	}

	private static char[] reverse(char[] arr, int i, int j) {
		
		// Base case
		
		if(i>=j)
		{
			return arr; 
		}
		
		// swap 2 string
		char temp= arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
		
		i=i+1;
		j=j-1;
		
		// recursive call		
		arr= reverse(arr, i, j);
		return arr;
	}

}
