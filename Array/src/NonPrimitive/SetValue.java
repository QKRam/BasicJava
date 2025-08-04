package NonPrimitive;

public class SetValue {
	

		public Teacher[] setvalues() {
			Teacher tea[] = new Teacher [3];
			
			Teacher t =new Teacher();
			t.settId(101);
			t.settName("Ganesh");
			t.settSal(36373.6);
			
			tea[0]=t;
			
			Teacher t1 =new Teacher();
			t1.settId(102);
			t1.settName("Akshay");
			t1.settSal(36773.6);
			
			tea[1]=t1;
			
			Teacher t3 =new Teacher();
			t3.settId(103);
			t3.settName("ramesh");
			t3.settSal(16773.6);
			tea[2]=t3;
			
			
			return tea;
			
		}
}
	
