// How can we make String Lower case to Upper case?

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q09_String_LowerCase_UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		 String strUpper, strLower;
	     Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter String in Lowercase : ");
	        strLower = scan.nextLine();
	        
	        strUpper = strLower.toUpperCase();
	        System.out.print("Equivalent String in Uppercase : " + strUpper);
	        
	        scan.close();


	}

}
