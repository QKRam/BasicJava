package NonPrimitive;

public class GetValue {

	
		 public void getdata(Teacher tea[]) {
			 for(int i=0;i<tea.length;i++) {
				 Teacher tt=tea[i];
				 System.out.println(tt.gettId());
				 System.out.println(tt.gettName());
				 System.out.println(tt.gettSal());
			 }
		 }
		 

		 
	}
