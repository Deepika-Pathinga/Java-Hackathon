// Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q13_String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		System.out.println("Enter string to reverse:");
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		read.close();
		String reverse = "";
		
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Reversed string is: "+reverse);

	}

}
