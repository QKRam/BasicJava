package NonPrimitive;

public class Test {
	
		public static void main(String[] args) {
			SetValue sv =new SetValue();
			Teacher tea[]=sv.setvalues();
			
			GetValue gv=new GetValue();
			gv.getdata(tea);
			
		}

	}

	

