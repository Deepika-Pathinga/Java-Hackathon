// WJP to perform ascending order Selection sort

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q06_Selection_Sort {
	
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
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
		
		System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  

	}

}