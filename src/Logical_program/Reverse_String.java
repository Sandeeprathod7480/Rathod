package Logical_program;

public class Reverse_String 
{		
		//Reverse_String
	public static void main(String[] args)
	{
		String Org="Viraj";
		String rev="";
		
		for (int i=Org.length()-1;   i>=0;   i--)
		{
			rev=rev+Org.charAt(i);
		}
		
		System.out.println(rev);    //jariV
		
	}

}
