package StringTask1;

	import java.util.Scanner;

	public class RepetedChar {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter a String :- ");
			String s = sc.nextLine();

			
			for(int i = 0;i <s.length();i++)
			{
				int found = 0;
				for(int j = 0; j<s.length();j++)
				{
					if(s.charAt(i) == s.charAt(j) && i!=j)
					{
						found++;
					}
				}
				if(found != 0)
				{
					System.out.println(s.charAt(i) + " is Repeated " + found + " times..");
				}
			}
		}

	}


