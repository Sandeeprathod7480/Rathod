package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Sample1 
{	
	public static void main(String[] args) 
	{	
		HashSet    hs=new    HashSet();
		
		//Add Information
		
		hs.add("virat");
		hs.add(100);
		hs.add('A');
		hs.add(80.52);
		hs.add(100); 		//Duplicate
		hs.add(null);
		hs.add(null);		//Duplicate
		
		System.out.println(hs);
		
		//Size
		System.out.println(hs.size());			//5
		
		//Is empty or not
		System.out.println(hs.isEmpty());		//false
		
		//To verify information
		System.out.println(hs.contains('A'));	//true

		//Remove information
		hs.remove('A');
		System.out.println(hs);
		
		System.out.println("-----------for each loop-------------");
		
		for (Object  S1:hs)
		{
			System.out.println(S1);
		}
		
		System.out.println("---------Using Iterator Curser---------");
		
		Iterator      Itr=hs.iterator();
		
		while(Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
		
	}

}
