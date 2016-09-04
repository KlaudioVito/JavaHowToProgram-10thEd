package ch10;

public class Car implements CarbonFootprint {
	private double distance, emmission;
	private final double EF = 2.32;
	
	Car(double distance){
		if(distance < 0){
			throw new IllegalArgumentException("Distance cannot be less then zero!");
		}
		else{
			this.distance = distance;
			setEmmission();
		}
	}
	private void setEmmission(){
		emmission = distance*EF;
	}

	@Override
	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return emmission;
	}

}
