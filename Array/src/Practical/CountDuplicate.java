package Practical;

public class CountDuplicate {

		
		public static void main(String[] args) {
			
			int i = 0, j, count = 0;
			int[] cd = {7, 3,9, 3, 2, 7, 11, 4, 8, 11,7,4,8,10};
			
			while(i < cd.length) 
			{
				j = i + 1;
				while(j < cd.length)
				{		
					if(cd[i] == cd[j]) {
						System.out.println(cd[i]);
						count++;
						break;
					}
					j++;
				}
				i++;
			}
			System.out.println("\nThe Total Number of Duplicates  = " + count);
			
		}
	}

