package Data;
public class Student extends College
{

	
	private String stuName;
	private int rollNo;
	
	
	public Student(String clgName, String clgAddress, long clgMobNo, String stuName, int rollNo) {
		super(clgName, clgAddress, clgMobNo);
		this.stuName = stuName;
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public int getRollNo() {
		return rollNo;
	}
	

	

}



