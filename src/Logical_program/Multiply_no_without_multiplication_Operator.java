package Logical_program;

public class Multiply_no_without_multiplication_Operator 
{	
	//Multiply_no._without_multiplication_Operator
	
	public static void main(String[] args) 
	{	
		int num1=5;
		int num2=2;
		
		int Sum=0;  //10
		     
		//i=1        1<=5			2
					//2<=5			3
					//3<=5			4
					//4<=5			5
					//5<=5			6
					//6<=5
		for (int i=1;  i<=num1; i++)
		{
			Sum=Sum+num2;			//10
		}
		System.out.println(Sum);
		
	}
		
	
	
	
	
	
	

}
