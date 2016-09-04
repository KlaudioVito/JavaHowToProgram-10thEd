package ch10;

public class Bicycle implements CarbonFootprint {
	private double calories, emmission;
	private final double EF = 0.02;
	
	Bicycle(double calories){
		if(calories < 0){
			throw new IllegalArgumentException("Calories cannot be less then zero!");
		}
		else{
			this.calories = calories;
			setEmmission();
		}
	}
	private void setEmmission(){
		emmission = calories * EF * 365;
	}
	@Override
	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return emmission;
	}

}
