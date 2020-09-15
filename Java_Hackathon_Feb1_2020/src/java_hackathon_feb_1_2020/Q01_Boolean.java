//Consider there is a 3 Boolean variable called a, b, c. 
//Check if at least two out of three Boolean's are true  

package java_hackathon_feb_1_2020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q01_Boolean {
	
	public static void atleastTwoTrue(boolean a, boolean b, boolean c) {
		if ((a && b) || (b && c) || (a && c)) {
	        System.out.println("Yay!! Atleast two of the three Boolean's value are true");
	        
	    }
	    else{
	        System.out.println("Sorry! Atleast two of the three Boolean's value are not true ");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("Java program to find out if atleast 2 out of 3 boolean's are true");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter boolean a value:");
		boolean a = sc.nextBoolean();
		System.out.println("Please enter boolean b value:");
		boolean b= sc.nextBoolean();
		System.out.println("Please enter boolean c value:");
		boolean c= sc.nextBoolean();
		
		atleastTwoTrue(a,b,c);
			
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a boolean input, true or false");
		}

	}

}

