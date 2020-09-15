// Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q14_Reverse_Words {

	public static void main(String[] args) {
				
		System.out.println("Enter a sentence to reverse the string...");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse[] = str.split(" ");
		
		int len = reverse.length;
		System.out.println("Given words:");
		for (int i = 0; i < len ; i++){
	          System.out.print(reverse[i]+" ");	      
	    }
		System.out.println();
		System.out.println("Reversed words:");
		for (int i = len-1; i >=0 ; i--){
	          System.out.print(reverse[i]+" ");	      
	    }
				
		sc.close();

	}

}
