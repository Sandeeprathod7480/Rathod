package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Test1 
{	
	public static void main(String[] args) 
	{	
		ArrayList     L1=new    ArrayList();
		
		//Add information
		
		L1.add("Virat");
		L1.add(100);
		L1.add('A');
		L1.add(50.25f);
		L1.add(100);
		L1.add(null);
		L1.add(null);
		
		System.out.println(L1);
		
		//Verify arraylist is empty or not
		System.out.println(L1.isEmpty());   	//False
		
		//Size/ Capacity
		System.out.println(L1.size());  		//7
		
		//To verify information is present or not
		System.out.println(L1.contains('A'));	//True
		
		//To add the information in between Arraylist----->Right Shift operation
		L1.add(3,500);
		System.out.println(L1);
		
		//Remove information------->Left Shift operation
		L1.remove(3);
		System.out.println(L1);
		
		//Update Information
		L1.set(3, 55.25);
		System.out.println(L1);
		
		//To find index of data
		System.out.println(L1.indexOf(55.25));
		
		//To get the data by providing index
		System.out.println(L1.get(3));
		
		System.out.println("-----------For Each loop------------------");
		
		for (Object S1:L1)
		{
			System.out.println(S1);
		}
		
		System.out.println("--------------Using iterator curser-------------------");
		
			Iterator Itr=L1.iterator();
		
			while (Itr.hasNext())	
			{
				System.out.println(Itr.next());
			}
			
		System.out.println("---------Using ListIterator---------");
		
			ListIterator    Ltr=L1.listIterator();
			
			while(Ltr.hasNext())
			{
				System.out.println(Ltr.next());
			}
		
	}

}
