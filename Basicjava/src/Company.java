
public class Company {
	private int compId;
	private String compName;
	private Address ad;
	private Department dep;
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	
}
