// WJP to display duplicate character in string

package java_hackathon_feb_1_2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q18_Duplicate_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
        for(char c : arr) 
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        
       // System.out.print(map.keySet());
        //System.out.println(map.values());
        
          
        
         
        System.out.println("Duplicate characters excluding white space :");
         
        //Print duplicate characters excluding white space
        for(char c : map.keySet()) { 
        	//map.getOrDefault(c, map.containsValue())
            if(map.get(c) >= 1 && !Character.isWhitespace(c)) {
                System.out.println(c+" "+map.get(c));
            }
        }
         
	}

}
