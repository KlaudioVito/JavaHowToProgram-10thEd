package ch10;

import java.util.ArrayList;

public class CarbonFootPrintTest {
	public static void main(String[] args){
		int calories = 2000;
		int distance = 150;
		int electricityUse = 1200;
		int fuelUse = 500;
		Bicycle bic = new Bicycle(calories);
		Car c = new Car(distance);
		Building bldg = new Building(electricityUse, fuelUse);
		ArrayList<CarbonFootprint> set = new ArrayList<>();
		set.add(bic);
		set.add(c);
		set.add(bldg);
		for(CarbonFootprint cf : set){
			if(cf.equals(bic)){
				System.out.printf("Bicycle Emmission per year: %.2f%n", cf.getCarbonFootprint());
			}
			else if(cf.equals(c)){
				System.out.printf("Car Emmission per %d miles: %.2f%n", distance ,cf.getCarbonFootprint());
			}
			else if(cf.equals(bldg)){
				System.out.printf("Building Emmission: %.2f%n", cf.getCarbonFootprint());
			}
		}
	}
}
