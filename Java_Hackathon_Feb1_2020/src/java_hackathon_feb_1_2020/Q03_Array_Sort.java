// Given an array of integers, sort the integer values

package java_hackathon_feb_1_2020;

import java.util.Arrays;
import java.util.Scanner;

/*public class Q03_Array_Sort {

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
	
		System.out.println("Array before sorting:");
		for (int j=0; j<len; j++)
		{
			System.out.print(arr[j] + " ");
		}
		
		Arrays.sort(arr);
		
		System.out.println("\nArray after sorting:");
		for (int j=0; j<len; j++)
		{
			System.out.print(arr[j] + " ");
		}

	}

}*/

/*
 * Sol 2:*/
 public class Q03_Array_Sort {
  public static void main (String [] args) {
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
	
		System.out.println("Array before sorting:");
		for (int j=0; j<len; j++)
		{
			System.out.print(arr[j] + " ");
		}
   int temp;
   for (int i = 1; i < len; i++) {
    for (int j = i; j > 0; j--) {
     if (arr[j] < arr [j - 1]) {
      temp = arr[j];
      arr[j] = arr[j - 1];
      arr[j - 1] = temp;
     }
    }
   }
   System.out.println("\nArray after sorting:");
   for (int i = 0; i < len; i++) {
     System.out.print(arr[i]+" ");
   }
  }
}
//*/
