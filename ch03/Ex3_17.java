package ch03;

public class Ex3_17 {
	private String firstName, lastName, gender;
	private int month, day, year, height, weight;
	
	public Ex3_17(String firstName, String lastName, String gender, int month, int day, int year, int height, int weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public int getAge(){
		return (2016-this.year);
	}
	
	public int getMaxHeartRate(){
		return (220 - getAge());
	}
	
	public String getTargetRate(){
		return ("Target Heart Rate between " + getMaxHeartRate()*0.5 + " and " + getMaxHeartRate()*0.85);
	}
	
	public double getBMI(){
		return (this.weight*703)/(this.height*this.height);
	}
}
