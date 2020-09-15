// Given an array of integers check the Palindrome of the series. 

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q04_Array_Palindrome {
	
	 public static void isPalindrome(int arr[]){
		 int Palindrome =0;
		    for (int i = 0; i < arr.length / 2; i++) {
		        if (arr[i] != arr[arr.length - 1 - i]) {
		          Palindrome = 0;
		        }
		        else
		        {
		        	Palindrome = 1;
		        }
		    }
		  
		   
		   if (Palindrome == 1) {
			   System.out.println("The given array is a Palindrom");
		   } else
		   {
			   System.out.println("The given array is not a Palindrom");
		   }
		   
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[j] + " ");
			}
		   
		  
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int len = sc.nextInt();
		
		int arr[] = new int[len];
		System.out.println("Enter "+len+" elements of the array:");
		for(int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		 isPalindrome(arr);

	}

}
