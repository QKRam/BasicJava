package Comparable;

public  class Student implements Student2 {

	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
}
