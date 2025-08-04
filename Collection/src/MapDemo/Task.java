package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Task {

	public static void main(String[] args) {
		
		Map<Character, Double>m1=new HashMap();
			m1.put('a', 90.00);
			m1.put('b', 100.00);
			m1.put('c', 110.00);
			m1.put('d', 80.00);
			m1.put('e', 120.00);
			
			Map<Character, Map<Character, Double>>map=new HashMap();
				map.put('x',m1);
				
				System.out.println("=====By Using Lambda =========");
				map.forEach((a,b)->
					System.out.println(a+""+b));
					
				
	}
}
