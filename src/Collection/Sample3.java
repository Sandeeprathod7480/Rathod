package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Sample3 
{	
	public static void main(String[] args) 
	{	
		TreeSet   Tr=new   TreeSet();
		
		//add information
		
		Tr.add(100);
		Tr.add(200);
		Tr.add(500);
		Tr.add(400);
		Tr.add(100); 		//Duplicate
		Tr.add(300);
		Tr.add(600);
				
				System.out.println(Tr);
				
				//Size
				System.out.println(Tr.size());			//6
				
				//Is empty or not
				System.out.println(Tr.isEmpty());		//false
				
				//To verify information
				System.out.println(Tr.contains(300));	//true

				//Remove information
				Tr.remove(300);
				System.out.println(Tr);
				
				//To Remove First information
				Tr.pollFirst();
				System.out.println(Tr);
				
				//To remove Last information
				Tr.pollLast();
				System.out.println(Tr);
				
				//To print first information
				System.out.println(Tr.first());
				
				//To print Last Information
				System.out.println(Tr.last());
				
				
				
				
				System.out.println("-----------for each loop-------------");
				
				for (Object  S1:Tr)
				{
					System.out.println(S1);
				}
				
				System.out.println("---------Using Iterator Curser---------");
				
				Iterator      Itr=Tr.iterator();
				
				while(Itr.hasNext())
				{
					System.out.println(Itr.next());
				}
				
		
		
	}

}
