// WJP to find factorial of a number using recursion

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q28_Factorial_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		   System.out.println("Enter a number to find its factorial...");
		   Scanner sc = new Scanner (System.in);
			  int number=sc.nextInt();//It is the number to calculate factorial    
			  sc.close();
			  fact = factorial(number);   
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
			 static int factorial(int n){    
				  if (n == 0)    
				    return 1;    
				  else    
				    return(n * factorial(n-1));   

	}

}
