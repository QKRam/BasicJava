package Practical;
import java.util.*;
public class Reverse {
public static void main(String[] args) {
	

	int arr[]= {15,8,9,2,11,4};
	int temp[]=new int[arr.length];
	int count=0;
	
	for(int i=arr.length-1;i>0;i--) {
		
		temp[count]=arr[i];
		count++;
	}
	for(int n:temp) {
		
		System.out.println(n+"");
	}
}
}