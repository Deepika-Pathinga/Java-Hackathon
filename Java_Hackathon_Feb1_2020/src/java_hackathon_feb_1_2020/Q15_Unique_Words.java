// Given a string print the unique words of the string. 

package java_hackathon_feb_1_2020;

import java.util.*;

public class Q15_Unique_Words {

	public static void main(String[] args) {
		System.out.println("Enter a line of text: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();
		TreeMap<String, Integer> list = new TreeMap<String, Integer>();
		for(String str : s.split(" "))
		{
			if(list.containsKey(str))
			{
				list.put(str, list.get(str)+1);
			}
			else
			{
				list.put(str, 1);
			}
		}
		System.out.println("Unique words:");
		for(Map.Entry e: list.entrySet())
		{
			if((int)e.getValue() == 1)
				System.out.print(e.getKey()+" ");
		}
	}

}