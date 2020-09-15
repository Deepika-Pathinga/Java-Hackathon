// WJP to convert int to string

package java_hackathon_feb_1_2020;

import java.text.DecimalFormat;

public class Q22_Int_To_Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 200;
		System.out.println(i + 100);// 300 because + is binary plus operator

		String s1 = String.valueOf(i); // using String.value()
		System.out.println("Using String.valueof(): " + s1 + 100);// 200100 because + is string concatenation operator

		String s2 = Integer.toString(i); // using Integer.toString()
		System.out.println("Using Integer.toString(): " + s2 + 100);

		String s3 = String.format("%d", i);
		System.out.println("Using String.format(): " + s3 + 100);

		Integer obj = new Integer(i);
		String s4 = obj.toString();
		// String s4 = new Integer(200).toString();
		// String s4 = new Integer(i).toString();
		System.out.println("using Integer(int).toString(): " + s4 + 100);

		DecimalFormat df = new DecimalFormat("#");
		String s5 = df.format(i);
		// String s5 = new DecimalFormat().format(i);
		// String s5 = new DecimalFormat().format(200);
		System.out.println("using DecimalFormat: " + s5 + 100);

		StringBuffer sb1 = new StringBuffer();
		sb1.append(i);
		String s6 = sb1.toString();
		// String s6 = new StringBuffer().append(i).toString();
		// String s6 = new StringBuffer().append(200).toString();
		System.out.println("using String Buffer: " + s6 + 100);
		
		StringBuilder sb2 = new StringBuilder(); 
	    sb2.append(i); 
	    String s7 = sb2.toString(); 
	    // String s7 = new StringBuilder().append(200).toString(); 
	    // String s7 = new StringBuilder().append(i).toString(); 
	    System.out.println("using String Builder: " + s7 + 100);

	}

}
