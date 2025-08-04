package Practical;

public class Ascending {

	public static void main(String[] args) {
		
		int a[]= {2,5,3,8,4,9,78,12,85,24,65};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				
				if(a[j]<a[i]) {
					
					int k=a[i];
					 a[i]=a[j];
					 a[j]=k;
					
				}
				
			}
			
		}
		for(int value:a) {
			
			System.out.println(value+"");
		}
	}
}
