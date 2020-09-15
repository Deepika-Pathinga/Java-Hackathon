// WJP to display number of occurrence of all character 

package java_hackathon_feb_1_2020;

import java.util.HashMap;
import java.util.Scanner;

public class Q19_Character_Occurrence {
	
	private static void characterCount(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
  
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
  
        //Converting given string to char array
  
        char[] strArray = inputString.toCharArray();
  
        //checking each char of strArray
  
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
  
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
  
                charCountMap.put(c, 1);
            }
        }
         
        //Printing inputString and charCountMap 
  
        System.out.println(inputString+" : "+charCountMap);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		sc.close();
		
		characterCount(str);
		  
	  	}

}
