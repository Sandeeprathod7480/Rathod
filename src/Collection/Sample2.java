package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample2 
{	
	public static void main(String[] args) 
	{
		
		LinkedHashSet    L1=new  LinkedHashSet();
		
		//add information
		
		L1.add("virat");
		L1.add(100);
		L1.add('A');
		L1.add(80.52);
		L1.add(100); 		//Duplicate
		L1.add(null);
		L1.add(null);		//Duplicate
		
			System.out.println(L1);
		
		//Size
		System.out.println(L1.size());			//5
		
		//Is empty or not
		System.out.println(L1.isEmpty());		//false
		
		//To verify information
		System.out.println(L1.contains('A'));	//true

		//Remove information
		L1.remove('A');
		System.out.println(L1);
		
		System.out.println("-----------for each loop-------------");
		
		for (Object  S1:L1)
		{
			System.out.println(S1);
		}
		
		System.out.println("---------Using Iterator Curser---------");
		
		Iterator      Itr=L1.iterator();
		
		while(Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
		
		
		
		
	}

}
