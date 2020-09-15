// Write a method that will remove given character from the String?

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q16_Remove_Char {
	
	public static String Chartoremove(String string, char charToBeRemoved) {

		if (string == null)

		return "";

		StringBuilder strBuild = new StringBuilder ();

		for (int i = 0; i < string.length (); i++) {

			char ch = string.charAt (i);

			if (ch == charToBeRemoved)

				continue;

			strBuild.append (ch);}

			return strBuild.toString ();
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("Enter a character to remove from the above String");
		char c = sc.next().charAt(0);
	
		sc.close();
		System.out.println (Chartoremove (str,c));

	}

}