package Practical;

import java.util.Arrays;

public class StringAscending {

	public static void main(String[] args) {
		
		String sr[]= {"edf","learn","abc","xyz","pyq","ghy"};
		
		int size=sr.length;
		
		for(int i=0;i<size-1;i++) {
			
			for (int j = i+1; j<sr.length; j++) {
				
			
				if(sr[i].compareTo(sr[j])>0) {
					
				String x=sr[i];
				sr[i]=sr[j];
				sr[j]=x;
				}  
				}
		}
		System.out.println(Arrays.toString(sr));  
		}
}