// write a program to find factorial (Non Recursive)

package java_hackathon_feb_1_2020;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q02_Factorial {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Enter a whole number to find its factorial...");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
            
			if (num==0)
			{
				System.out.println("The factorial of 0 is 1");
			}
			else if (num<0)
			{
				System.out.println("Please enter any whole number...");
			}
			else if (num>0)
			{
				BigInteger fact = BigInteger.ONE; //fact = 1;
				
				for (int i=1; i<=num; i++)
				{
					fact = fact.multiply(BigInteger.valueOf(i)); //fact = fact*i;
				}
				
				System.out.println("The factorial of "+num+" is "+fact);
			}
			sc.close();
		}
         
      catch(InputMismatchException exception)
      {
      	System.out.println("Please enter correct input...");
      }

	}


}