package Comparable;

public class STudent2 implements Comparable<STudent2> {
	
	int id;
	String name;
	int rank;
	
	public STudent2(int id,String name,int rank) {
		this.id=id;
		this.name=name;
		this.rank=rank;
		
	}

	@Override
	public int compareTo(STudent2 o) {
		
		//return this.id-o.id;
		//return this.name.compareTo(o.name);
		return this.rank-o.rank;
	}

}
