
public class Test {

	public static void main(String[] args) {
	Address ad=new Address ();
	ad.setPinCode(443201);
	ad.setCityName("Pune");
	ad.setStreet("FC Road");
	
	EmloyeeDetail empD=new EmloyeeDetail();
	empD.setAdharNo("12345555988");
	empD.setMobno(855658455);
	empD.setEmail("abc@gmail.com");
	empD.setEmppanCardNo("34BC56");
	empD.setAd(ad);
	
	Employee emp=new Employee();
	emp.setEmpId(456);
	emp.setEmpName("Rohit");
	emp.setEmpSalary(56215);
	emp.setEmpD(empD);
	
	Department dep=new Department();
	dep.setDepId(123);
	dep.setDepName("HR");
	dep.setEmp(emp);
	
	Company comp=new Company();
	comp.setCompId(567);
	comp.setCompName("Lupin");
	comp.setAd(ad);
	comp.setDep(dep);
	
	System.out.println(comp.getCompId());
	System.out.println(comp.getCompName());
	System.out.println(comp.getAd().getCityName());
	System.out.println(comp.getAd().getPinCode());
	System.out.println(comp.getAd().getStreet());
	System.out.println(comp.getDep().getDepId());
	System.out.println(comp.getDep().getDepName());
	System.out.println(comp.getDep().getEmp().getEmpId());
	System.out.println(comp.getDep().getEmp().getEmpName());
	System.out.println(comp.getDep().getEmp().getEmpD().getAdharNo());
	System.out.println(comp.getDep().getEmp().getEmpD().getEmail());
	System.out.println(comp.getDep().getEmp().getEmpD().getEmppanCardNo());
	System.out.println(comp.getDep().getEmp().getEmpD().getMobno());
	//System.out.println(comp.getDep().getEmp().getEmpD().getEmail());
	
	
	

	
	}

}
