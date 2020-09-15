// Write a program which inputs a positive natural number N 
// and prints the possible consecutive number combinations, which when added give N. 
// INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4

package java_hackathon_feb_1_2020;

import java.util.*;

public class Q24_Consecutive_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int num;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number");
			num = input.nextInt();
			input.close();
			for (int i = 1; i < num; i++) {
				StringBuffer sb = new StringBuffer();
				int sum = i;
				sb.append(i).append(" ");
				for (int j = i + 1; sum < num; j++) {
					sb.append(j).append(" ");
					sum = sum + j;
					if (sum == num) {
					System.out.println(sb.toString());
					}
				}
			}

	}

}


