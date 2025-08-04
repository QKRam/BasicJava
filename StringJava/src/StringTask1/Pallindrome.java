package StringTask1;

import java.util.Scanner;

public class Pallindrome {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a String : ");
			String s = sc.nextLine();
			String s2 = "";
			
			for(int i = (s.length()-1);i>=0;i--)
			{
				char ch = s.charAt(i);
				s2 = s2 + ch;
			}
			
			if(s.equals(s2))
			{
				System.out.println("Palindrome String...");
			}
			else
			{
				System.out.println("Not a Palindrome String...");
				System.out.println("Original String ::-- " + s);
				System.out.println("Reversed String ::-- " + s2);
			}
			
		}

	}



