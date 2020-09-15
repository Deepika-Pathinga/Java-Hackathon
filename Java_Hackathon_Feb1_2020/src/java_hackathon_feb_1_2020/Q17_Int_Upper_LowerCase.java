// WJP to find total number of integers, uppercase and lowercase character in the give string 

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q17_Int_Upper_LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uppercase = 0, lowercase = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		sc.close();
		
		for(int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
            if (Character.isDigit(ch))
            	num++;
            if (Character.isLowerCase(ch))
            	lowercase++;
            if (Character.isUpperCase(ch))
            	uppercase++;
        }
		
		System.out.println("No. of Lower case letters : " + lowercase); 
        System.out.println("No. of Upper case letters : " + uppercase); 
        System.out.println("No. of integers : " + num); 
            
        }

	}

