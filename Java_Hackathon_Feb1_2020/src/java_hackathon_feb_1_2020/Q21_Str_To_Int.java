// WJP to convert string to int

package java_hackathon_feb_1_2020;

public class Q21_Str_To_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring String variable  
		String s="200";  
		//Converting String into int using Integer.parseInt()  
		int i1=Integer.parseInt(s); 
		int i2=Integer.valueOf(s);  //using Integer.valueof()
		int i3 = Integer.decode(s); //using Integer.decode()
	  
		System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator  
		System.out.println(i1+100);//300, because 200+100, here + is a binary plus operator
		System.out.println(i2+100);//300
		System.out.println(i3+100);//300
	}

}
