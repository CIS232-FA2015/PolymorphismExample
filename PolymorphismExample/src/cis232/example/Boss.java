package cis232.example;

public class Boss extends Employee{

	public Boss(String name){
		super.name = name;
	}
	
	@Override
	public Employee getBoss() {
		return null;
	}

}
