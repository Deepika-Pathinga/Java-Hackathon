/*
 * A circus is designing a tower routine consisting of people standing atop one another’s shoulders. 
 * For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. 
 * Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower. 
 * EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
 * Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190) 
 */

package java_hackathon_feb_1_2020;

import java.util.Arrays;

public class Q33_Circus_Tower {

	public void calculatePeople(Q33_Person[] input) {

        int weightArray[] = new int[input.length];
        String[] output = new String[input.length];
        for (int i=0;i<input.length;i++) {
            weightArray[i] = 1;
            output[i] = input[i].toString() + "";
        }
        int maxLength = 0;

        for (int i=1;i<input.length;i++) {
            for (int j=0;j<i;j++) {
                if( weightArray[j]+1>weightArray[i] && input[i].weight>input[j].weight) {
                    weightArray[i] = weightArray[j] + 1;
                    output[i] = output[j] + "\n" + input[i].toString();
                    if(maxLength<weightArray[i]) {
                        maxLength = weightArray[i];
                    }
                }
            }
        }

        System.out.println();


        for (int i = 0; i < input.length; i++) {
            if (weightArray[i] == maxLength) {
                System.out.println("Longest Increasing subsequence - \n" + output[i] + "\nof length = " + maxLength);
            }
        }

    }

    public static void main(String[] args) {
        Q33_Circus_Tower ct = new Q33_Circus_Tower();
        Q33_Person p1 = new Q33_Person(65,100);
        Q33_Person p2 = new Q33_Person(70,150);
        Q33_Person p3 = new Q33_Person(56, 90);
        Q33_Person p4 = new Q33_Person(75, 190);
        Q33_Person p5 = new Q33_Person(60, 95);
        Q33_Person p6 = new Q33_Person(68, 110);

        Q33_Person[] array = new Q33_Person[]{p1,p2,p3,p4,p5,p6};

        Arrays.sort(array);

        ct.calculatePeople(array);

    }


}
