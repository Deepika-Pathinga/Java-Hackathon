//  WJP to merge two sorted array.(Do not use third array) 
// array1[10] = 1,2,4,6,9,10 
// array2[4] = 3, 5,7,8 
// After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10 

package java_hackathon_feb_1_2020;

public class Q26_Merge_Sort {
	
	final static int INVALID_NUM = 0;
	
	public void mergeArrays(int[] arrayA, int[] arrayB){
		         
		        int validNumIndex = arrayA.length - 1;
	        for (int i = arrayA.length - 1; i >= 0; i--)
	        {
	            if (arrayA[i] != INVALID_NUM)
	            {
	                arrayA[validNumIndex] = arrayA[i];
	                validNumIndex -= 1;
	            }
	        }
	        
	         
	        int i = validNumIndex + 1;
	        int j = 0, k = 0;
	        
	         
	        while ((i < arrayA.length) && (j < arrayB.length))
	        {
	            if (arrayA[i] < arrayB[j])
	            {
	                arrayA[k++] = arrayA[i++];
	            }
	            else
	            {
	                arrayA[k++] = arrayB[j++];
	            }
	        }
	        
	         
	        while (j < arrayB.length)
	        {
	            arrayA[k++] = arrayB[j++];
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 2, 4, 6, 9, 10, INVALID_NUM, INVALID_NUM, INVALID_NUM, INVALID_NUM}; 
		int arr2[] = {3, 5, 7, 8};
		
		System.out.println("Array1:");
		for (int i=0; i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		System.out.println("\nArray2:");
		for (int i=0; i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		
		Q26_Merge_Sort merge = new Q26_Merge_Sort();
		merge.mergeArrays(arr1, arr2);
		
		System.out.println("\nArray1 after merge sort:");
		for (int i = 0;  i < arr1.length; i++)
			System.out.print(arr1[i] + " " );

	}

}