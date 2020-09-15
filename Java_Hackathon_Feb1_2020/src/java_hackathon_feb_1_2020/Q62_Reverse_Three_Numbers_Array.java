/*
 * write an algorithm to reverse first 3 numbers, then next 3 numbers, 
 * then next 3 numbers, the number will be based on var k. 
 * Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4] 
 */

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q62_Reverse_Three_Numbers_Array {
	
	// Function to reverse every sub-array formed by 
		// consecutive k elements 
		static void reverse(int arr[], int n, int k) 
		{ 
			for (int i = 0; i < n; i += k) 
			{ 
				int left = i; 
		
				// to handle case when k is not multiple 
				// of n 
				int right = Math.min(i + k - 1, n - 1); 
				int temp; 
				
				// reverse the sub-array [left, right] 
				while (left < right) 
				{ 
					temp=arr[left]; 
					arr[left]=arr[right]; 
					arr[right]=temp; 
					left+=1; 
					right-=1; 
				} 
			} 
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int len = sc.nextInt();
		System.out.println("Enter elements:");
		int arr[] = new int[len];
		for (int i=0; i<len; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		int k = 3; 
		System.out.println("Before:");
		for (int i = 0; i < len; i++) 
			System.out.print(arr[i] + " "); 
	
		reverse(arr, len, k); 
		System.out.println("\nAfter:");
		for (int i = 0; i < len; i++) 
			System.out.print(arr[i] + " "); 

	}

}
