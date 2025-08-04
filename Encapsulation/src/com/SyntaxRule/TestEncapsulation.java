package com.SyntaxRule;

public class TestEncapsulation {
	
	  
		public static void main(String[] args) {  
		    //creating instance of Account class  
		    Account acc=new Account();  
		    //setting values through setter methods  
		    acc.setAccNo(7560504000L);  
		   // acc.setName2("Sonoo Jaiswal");  
		    acc.setNameEmail("sonoojaiswal@javatpoint.com");  
		    acc.setAmount(500000f);  
		    //getting values through getter methods  
		    System.out.println(acc.getAccNo()+" "+acc.getNameEmail()+" "+acc.getNameEmail()+" "+acc.getAmount());  
		}  
		  


}
