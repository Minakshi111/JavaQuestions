import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList_program2 {
	
	public static void main(String[] str)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		List<Integer> list= new ArrayList<>();
		int i=0;
		while(i<n)
		{
			list.add(Integer.parseInt(sc.next()));
			i=i+1;
		}		
		List<Integer> new_list= removeDuplicate(list);		
		for( int j=0; j<new_list.size();j++)
		{
			System.out.print(new_list.get(j)+" ");
		}
	}

	private static List<Integer> removeDuplicate(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> list_new= new ArrayList<>();
		for( int i=0; i<list.size();i++)
		{
			int current= list.get(i);
			
				for ( int j=i;j<list.size();j++)
				{
					if(list.get(i)==list.get(j))
					{
						list.remove(j);
						
					}			
			}
				list_new.add(i);
					
		}		
		System.out.println("Value is returned");
		return list_new;		
	}

}