package Finally;

public class Test {

	public int m1() {
		
		int x=10;
		
		try {
			System.out.println("Try==Block");
			return x;
		}
		finally{
			System.out.println("Finally ==Block");
		}
		
	}
		public static void main(String[] args) { 
			Test t=new Test();
			int x=t.m1();
			System.out.println(x);
			
		}
		
		
		
	}

