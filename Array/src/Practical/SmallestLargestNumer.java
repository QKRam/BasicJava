package Practical;

public class SmallestLargestNumer {
public static void main(String[] args) {
	

	int a[]= {7,51,133,103,2,12,90,112,36};
	int smallest=a[0];
	int largest=a[0];
	{
	
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>largest)
			largest=a[i];
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<smallest)
		smallest=a[i];
	}
	System.out.println("Larger no is="+largest);
	System.out.println("Smallest no is="+smallest);

	}
}
}
