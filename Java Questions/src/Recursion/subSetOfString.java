package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subSetOfString {
	
	
	
	public static void main(String[] str)
	{
		
		String s= "123";
		 List <String> a1= new ArrayList<String>();
		
		List<String> l1= check_subsets(s, 0, "", a1);
		
		for (int i=0; i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
	}

	private static List<String> check_subsets(String s, int count, String out, List<String> a1 ) {
		
		if(count==s.length())
		{			
			a1.add(out);
			
			return a1;
		}
		
		// excluude call
				a1= check_subsets(s, count+1, out, a1);
		
		// include call
		
		char ele= s.charAt(count);
		out= out+String.valueOf(ele);
		a1= check_subsets(s, count+1, out, a1);
		return a1;
		
		
		
	}

}
