// Given an array prints the unique numbers 
// and also print the number of occurrences of duplicate numbers.

package java_hackathon_feb_1_2020;

import java.util.Scanner;

public class Q05_Array_Occurrence_Of_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
	      System.out.print("Enter the length of the array:");
	      int n = s.nextInt();
	      
	      int numbers[] = new int[n];
	      int fr[] = new int [n]; //Array fr will store frequencies of element  
	      int visited = -1;  
	      
	      System.out.println("Enter all the elements:");
	      for(int i = 0; i < n; i++)
	      {
	          numbers[i] = s.nextInt();
	      }
	      
	      for(int i = 0; i < n; i++)
	      {  
	          int count = 1;  
	          for(int j = i+1; j < n; j++)
	          {  
	              if(numbers[i] == numbers[j])
	              {  
	                  count++;  
	                  //To avoid counting same element again  
	                  fr[j] = visited;  
	              }  
	          }  
	          if(fr[i] != visited)  
	              fr[i] = count;  
	      }  
	     
	      
	    //Displays the frequency of each element present in array  
	      for(int i = 0; i < fr.length; i++){  
	         if(fr[i] != visited) 
	              System.out.println(numbers[i] + " --> Occurred " + fr[i]+" times");  
	      }  

	      s.close();

	}

}