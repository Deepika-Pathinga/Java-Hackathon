// Write a program to check palindrome (MalayalaM) for both numbers and string? 

package java_hackathon_feb_1_2020;

public class Q12_String_Palindrome {
	
	private void palindrome(String str){            
        StringBuilder sb = new StringBuilder(str);
        // reverse the string and check if it is equal to original string
        if(str.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println(str + " is a Palindrome");
        }else{
            System.out.println(str + " is not a Palindrome");
        }        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q12_String_Palindrome pm = new Q12_String_Palindrome();
        pm.palindrome("Radar");
        pm.palindrome("MalayalaM");
        pm.palindrome("Deepika");
        pm.palindrome("1234442");
        pm.palindrome("1235321");
        pm.palindrome("1221");

	}

}
