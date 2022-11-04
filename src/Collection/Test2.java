package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test2 
{	public static void main (String[]args)
	{
		Vector   V1=new   Vector();
		
		//To add information
		V1.add("Rahul");
		V1.add(200);
		V1.add('A');
		V1.add(80.15f);
		V1.add(200);
		V1.add(null);
		V1.add(null);
		
		System.out.println(V1);
		
		//Verify arraylist is empty or not
		System.out.println(V1.isEmpty()); 		//false
		
		//Size/ Capacity
		System.out.println(V1.size()); 			//7
		
		//To verify information is present or not
		System.out.println(V1.contains('A'));  		//true
		
		//To add the information in between Arraylist----->Right Shift operation
		V1.add(2, 500);
		System.out.println(V1);
		
		//Remove information------->Left Shift operation
		V1.remove(2);
		System.out.println(V1);
		
		//Update Information
		V1.set(3, 81.15);
		System.out.println(V1);
		
		//To find index of data
		System.out.println(V1.indexOf(81.15));
		
		//To get the data by providing index
		System.out.println(V1.get(3));
		
		System.out.println("------------For Each loop---------------");
		
		for (Object S1:V1)
		{
			System.out.println(S1);
		}
		
		System.out.println("--------Using iterator curser-------------");
		
		Iterator    Itr=V1.iterator();
		
		while (Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
		
		System.out.println("------------------Using ListIterator Curser------------------");
		
		ListIterator  L1=V1.listIterator();
		
		while (L1.hasNext())
		{
			System.out.println(L1.next());
		}
		
		System.out.println("---------Using Enumeration curser---------------------");
		
		Enumeration    E1=V1.elements();
		
		while(E1.hasMoreElements())
		{
			System.out.println(E1.nextElement());
		}
		
		
		
	}

}
