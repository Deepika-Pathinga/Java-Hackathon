// How to Split String in java? 

package java_hackathon_feb_1_2020;

public class Q11_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Javaaa";  
	        System.out.println("Limit is zero:");  
	        String[] arr = str.split("a", 0);  
	        for (String w : arr) {  
	            System.out.println(w);  
	        }  
	        System.out.println("Split array length: "+arr.length); 
	        
	        String str1 = "Javaaa";  
	        System.out.println("Limit is negative:");  
	        String[] arr1 = str1.split("a", -9); 
	        for (String w : arr1) {  
	            System.out.println(w);  
	        }  
	        System.out.println("Split array length: "+arr1.length); 
	        
	        String str2 = new String("28/12/2013");
	        System.out.println("Spilt using /:");  
	        String array1[]= str2.split("/");
	    	for (String temp: array1){
	    	      System.out.println(temp);
	    	}
	    	
	    	System.out.println("Limit is 2:");  
	    	String array2[]= str2.split("/", 2);
	    	for (String temp: array2){
	    	      System.out.println(temp);
	    	}
	    	
	    	String s = " ,ab;gh,bc;pq#kk$bb";
	    	System.out.println("Multiple Delimiters [,;#$] ");  
	    	String[] str3 = s.split("[,;#$]"); // multiple delimiters
	    	System.out.println("Number of substrings: "+str3.length);
			
	    	for (int i=0; i < str3.length; i++) {
	    		System.out.println("Str["+i+"]:"+str3[i]);
	    	}
	}

}
