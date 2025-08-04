package Practical;
import java.util.Arrays;

public class AssendingOrder {
	

	public static void main(String[] args) {
		
	int a[]= {3,12,153,54,19,33,34,1,25};
	
	Arrays.sort(a);
	System.out.println("Smallest element in array:="+a[0]);
	System.out.println("Largest element in array:="+a[a.length-1]);
	
	for (int value:a) {
		System.out.println(value+"");
	}

	}
}
