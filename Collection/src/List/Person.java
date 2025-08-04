package List;

public class Person {

	private int pId;
	private String pName;
	private float salary;
	private String city;
	public Person(int pId, String pName, float salary, String city) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.salary = salary;
		this.city = city;
	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public float getSalary() {
		return salary;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pId + ", pname=" + pName + ", salary=" + salary + ", city=" + city + "]";
	}
	}
	
	
	

