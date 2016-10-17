package ch2;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex2_34 {
	private static BigDecimal currPopulation = BigDecimal.valueOf(7392633555.00);
	private static final BigDecimal rate = BigDecimal.valueOf(30.0);
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			currPopulation = currPopulation.multiply(rate);
			System.out.println("Year " + (i+1) + " population is: " + NumberFormat.getNumberInstance(Locale.US).format(currPopulation));
		}
	}
}
