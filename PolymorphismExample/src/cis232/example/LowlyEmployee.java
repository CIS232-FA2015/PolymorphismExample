package cis232.example;

public class LowlyEmployee extends Employee {

	Employee boss;
	public LowlyEmployee(String name, Employee boss){
		super.name = name;
		this.boss = boss;
	}
	
	@Override
	public Employee getBoss() {
		return null;
	}

}
