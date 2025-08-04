package StringConstantPool;

public class Vovels {

	private static int ii;
	private static boolean charAt;

	public static void main(String[] args) {
		
		int vCount=0;
		String name="Mangesh";
		
		name=name.toLowerCase();
		
		for(int i=0;i<name.length();ii++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				vCount++;
			}
			
		}
		System.out.println("Number of v;-"+vCount);
	}
}
