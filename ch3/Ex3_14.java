package ch03;

public class Ex3_14 {
	private int month, day, year;
	
	public Ex3_14(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
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
	
	public void displayDate(){
		System.out.println(this.month + "/" + this.day + "/" + this.year);
	}
}
