package Questions;

public class Largest_palindrome_string {
//	static String res="";
	static int max=0;
	
	public static void main(String[] str)
	{
		
		String s= "cbbd";
			String res= function(s,"",0,"");
			System.out.println(res);
		
	}

	private static String function(String s, String out, int index,String res) {
		
		if(index==s.length())
		{
			if(isPalindrome(out))
			{
				System.out.println(out);
				if( max < out.length())
				{
					 res= out;
					 max= out.length();
					 System.out.println(max);
				}
			}
			return res;
		}
		
		// exclude wala call
		
		res= function(s,out,index+1,res);
		
		// Include call
		
		char ele= s.charAt(index);
		out= out+ele;
		res=  function(s, out,index+1,res);
		
		return res;
		
	}
	
private static boolean isPalindrome(String s1) {
		
		
		int i=0; 
		int j= s1.length()-1;
		
		while (i<j)
		{
			if(s1.charAt(i) != s1.charAt(j))
			{
				return false;
			}
			i=i+1;
			j=j-1;
			
		}	
		return true;
	}

}
