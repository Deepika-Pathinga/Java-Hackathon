//  Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)

package java_hackathon_feb_1_2020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q31_File_Copy_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		      BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\deepi\\eclipse-workspace\\Java_Hackathon_Feb1_2020\\src\\java_hackathon_feb_1_2020\\Source"));
		      ArrayList list = new ArrayList();
		      String line;
		      while ((line = input.readLine()) != null) {
		        list.add(line);
		      }
		      input.close();

		      Collections.reverse(list);

		      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\deepi\\eclipse-workspace\\Java_Hackathon_Feb1_2020\\src\\java_hackathon_feb_1_2020\\Destination")));
		      for (Iterator i = list.iterator(); i.hasNext();) {
		        output.println((String) i.next());
		      }
		      output.close();
		      System.out.println("Files copied [line by line] in reverse order successfully!");
		    } catch (IOException e) {
		      System.err.println(e);
		    }

	}

}
