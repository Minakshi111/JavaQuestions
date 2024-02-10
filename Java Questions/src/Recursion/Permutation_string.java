package Recursion;

public class Permutation_string {
	public static void main(String[] str)
	{
		
		String s= "ABC";
		char[] ch= s.toCharArray();
		
		permute(ch,0);
	}

	private static void permute(char[] s, int index) {
		
		if(index>=s.length)
		{
			
		System.out.println(String.valueOf(s));
		return;
		}
		
		for ( int j=index; j<s.length;j++)
		{
			// swap index and j
			char temp= s[index];
			s[index]= s[j];
			s[j]= temp;
			
			// call recursion
			
			permute(s,index+1);
			
			// re swap for back tracking
			
			// again swap
			char temp1= s[index];
			s[index]= s[j];
			s[j]= temp1;
			
		}
		
		
	}

}
