// WJP to differentiate input as string, int or bool 

package java_hackathon_feb_1_2020;

public class Q23_Input_Str_Int_Boolean {
	
	public static void input(String s) 
    { 
		int num=0, str =0;
		if(s.equalsIgnoreCase("true")||s.equalsIgnoreCase("false")){
            System.out.println("Given input "+s+" is a boolean");
         }
		else {
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i)) == true) {
					num++;
				}
				else {
					str++;				
				}
			}
			if(num>0 && str == 0)
			{
				System.out.println("Given input "+s+" is Number");
			}
			else
			{
				System.out.println("Given input "+s+" is String");
			}
				
        }  
    } 

	public static void main(String[] args) {
		
	input("Java");
	input("123");
	input("TrUe");
	input("Java8");	

	}

}
