package ch05;

public class Ex5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pythagorean Triangles\nSide 1\tSide 2\tHypotenuse");
		for(int side1 = 1; side1 < 500; side1++){
			for(int side2 = 1; side2 < 500; side2++){
				for(int hypothenuse = 1; hypothenuse < 500; hypothenuse++){
					if(side1*side1 + side2*side2 == hypothenuse*hypothenuse){
						System.out.println(side1 + "\t" + side2 + "\t" + hypothenuse);
					}
				}
			}
		}
	}

}
