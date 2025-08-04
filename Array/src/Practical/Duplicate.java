package Practical;

public class Duplicate {

public static void main(String[] args) {
		int count=0;

	int a[]= {7,9,6,3,2,2,8,7,5,9,7};
	
	//String s[]= {"Java","C","C++","C","Python","Java"};
	
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				
				System.out.println(a[i]);
			}
		}
	}
	
}	
}
