package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeypad {
	static List<String> a1= new ArrayList<String>();
	static String mapArr[]= {"","","abc","def"};
	
	public static void main(String[] str)
	{
		String s= "23";	
	keypad(s,"",0 )	;
		
	
	
	for ( int i=0; i<a1.size();i++)
	{
		System.out.println(a1.get(i));
	}
	}

	private static void keypad(String s, String out, int i) {
		
		if(i>= s.length())
		{
			a1.add(out);
			return;
		}
		
		int index= s.charAt(i)- '0';
		char[] ch= mapArr[index].toCharArray();
		
		/* wherever you feel that there are 2 variables needed to manage the recursion that means there should be for loop in picture 
		 */
		
		for ( int k=0; k<ch.length;k++)
		{
			out=out+String.valueOf(ch[k]);
			keypad(s, out, i+1);	
			// backtrack
			 out= out.substring(0,out.length()-1);
		}
		
	}

}
