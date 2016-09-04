package ch10;

public class Building implements CarbonFootprint {
	private double electricity, fuel, useE, useF;
	private final double electricityEF = 0.6;
	private final double fuelEF = 3.1; 
	
	Building(double useE, double useF){
		if(useE < 0 || useF < 0){
			throw new IllegalArgumentException("Use cannot be less then zero!");
		}
		else{
			this.useE = useE;
			this.useF = useF;
			setEmmissions();
		}
	}
	private void setEmmissions(){
		electricity = useE * electricityEF;
		fuel = useF * fuelEF;
	}
	
	public double getElectricity(){
		return electricity;
	}
	
	public double getFuel(){
		return fuel;
	}
	@Override
	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return electricity + fuel;
	}
	
	
}
