package prob5;//부분재정의

public class Depart extends Employee {
	private String depart;

	public Depart(String name, int salary, String depart) {
		super.setName(name);
		super.setSalary(salary);
		this.depart = depart;
	}
	
	@Override
	public void getInformation() {
		System.out.println("이름:" + super.getName() + 
							" 연봉:" + super.getSalary() + 
							" 부서:" + depart);
	}
}
