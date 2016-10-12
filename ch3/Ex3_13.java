package ch03;

public class Ex3_13 {
	private String firstName, lastName;
	private double monthlySalary;
	
	public Ex3_13(String firstName, String lastName, double monthlySalary){
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setSalary(double monthlySalary){
		if(monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public double getSalary(){
		return this.monthlySalary;
	}
}
