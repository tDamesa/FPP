package w1l5_homework.prob2;

import java.time.LocalDate;

public class DeptEmployee {
	private  String name;
	public double salary;
	private LocalDate hireDate;
	

	public DeptEmployee(String name, double salary, LocalDate hireDate) {
		this.name=name;
		this.salary=salary;
		this.hireDate=hireDate;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void sethireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public LocalDate gethireDate() {
		return hireDate;
	}
	public double computeSalary(){
		return this.salary;
	}
}
