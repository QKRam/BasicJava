package Practical;

public class EvenSum {

	 public static void main(String[] args) {      
         
	        
	        int s []  = {1,3, 2, 4, 6, 5,12,13,8,19};   
	        int sum = 0;  
	          
	          
	        for (int i = 0; i < s.length; i++) {   
	           
	        	if(s[i]%2==0) {
	        		sum = sum + s[i];
	        		System.out.println("  Even Number:-"+s[i]);
	        	}
	        }    
	        System.out.println("Sum of Even Number: " + sum);  
	    }  
}
