import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse_arrayList {
	
	public static void main(String [] str)
	{
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		// Input is coming in one line
		
		List<Integer> list= new ArrayList<Integer>();
		
		int i=0;
		while (i<n)
		{
			list.add(Integer.parseInt(sc.next()));
			i=i+1;
		}
		
		List<Integer> new_list= new ArrayList<Integer>();
		new_list= reverse(list);
		
		for ( int i1=0; i1<new_list.size();i1++)
		{
			System.out.println(new_list.get(i1));
		}
	}

	private static List<Integer> reverse(List<Integer> list) {
		
		List<Integer> new_list= new ArrayList<Integer>();
		
		for ( int i=list.size()-1; i>=0;i--)
		{
			int current= list.get(i);
			new_list.add(current);
		}
		return new_list;
	}
}
