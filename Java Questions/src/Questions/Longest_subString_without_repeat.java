package Questions;

public class Longest_subString_without_repeat {

	public static void main(String[] str)
	{
		String s= "pwwk";
		
		int len= function(s);
		System.out.println(len);
		
	}

	private static int function(String s) {
		
		int left=0;
		int right=1;
		int ans=0;
		
		if(s.length()==1)
			return 1;
		
		if(s.length()==0)
			return -1;
		
		while (right != s.length())
		{
			int k= left;
			int count=1;
			
			
			while(k < right)
			{
				if(s.charAt(right) != s.charAt(k))
				{
					count=count+1;
					k=k+1;
				}
				else
				{
					k=k+1;
					left= k;	
					count=1;
					
				}
			}
			
			if(ans<count)
				ans= count;
			
			right= right+1;		
		}
		return ans;
	}
}
