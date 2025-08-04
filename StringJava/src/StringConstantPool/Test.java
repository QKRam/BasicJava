package StringConstantPool;

public class Test {

	public static void main(String[] args) {
		
		String s1="ABC";
		String s2="ABC";
		
		System.out.println(s1==s2);// it cakes location
		System.out.println(s1.equals(s2));//it cakes content
		
		//Creating String object using new operator
		
		String s3=new String("abc");
		String s4=new String("abc");
		
		System.out.println(s3==s4);// it cakes location
		System.out.println(s1.equals(s4));
		
		System.out.println(s2==s4);// it cakes location
		System.out.println(s1.equals(s3));
		
		
	}
}
