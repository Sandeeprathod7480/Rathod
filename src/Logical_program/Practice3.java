package Logical_program;

import java.util.Arrays;

public class Practice3 
{	
	public static void main(String[] args) 
	{
		char C1[]= {'A','B','C'};	
		char C2[]= {'D','E','F'};
		char C3[]= {'D','E','F'};
		
		System.out.println(Arrays.equals(C1,C2));//False
		System.out.println(Arrays.equals(C2,C3));//True
		System.out.println(Arrays.equals(C1, C3));//False
	
	}

}
