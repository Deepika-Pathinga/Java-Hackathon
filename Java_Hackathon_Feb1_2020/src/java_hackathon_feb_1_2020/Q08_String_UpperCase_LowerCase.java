// How can we make String upper case to lower case?

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q08_String_UpperCase_LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String strUpper, strLower;
	     Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter String in Uppercase : ");
	        strUpper = scan.nextLine();
	        
	        strLower = strUpper.toLowerCase();
	        System.out.print("Equivalent String in Lowercase : " + strLower);
	        
	        scan.close();

	}

}