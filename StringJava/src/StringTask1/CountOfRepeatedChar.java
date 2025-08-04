package StringTask1;

import java.util.Scanner;

public class CountOfRepeatedChar {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int found = 0;
			
			System.out.println("Enter a String : - ");
			String s = sc.nextLine();
			
			System.out.println("Enter a Character to Find..");
			char ch = sc.next().charAt(0);
			
			for(int i =0;i<s.length();i++)
			{
				if(ch == s.charAt(i))
				{
					found++;
				}
			}
			System.out.println("Character " + ch + " is Present " + found + " times in the given String");
		}

	}



