package ch05;

import java.util.Scanner;

public class Ex5_31 {
	private String user;
	private int totalPoints;
	
	public Ex5_31(String user){
		this.user = user;
		this.totalPoints = 0;
	}
	
	public void setUser(String user){
		this.user = user;
	}
	
	public String getUser(){
		return this.user;
	}
	
	public void resetPoints(){
		this.totalPoints = 0;
	}
	
	public int getPoints(){
		return this.totalPoints;
	}
	
	public void takeQuiz(){
		Scanner input = new Scanner(System.in);
		int answer;
		System.out.println("***Welcome to the Global Warming Facts Quiz***\n");
		
		System.out.println("Question 1\nWhat is Global Warming?");
		System.out.println("1. The result of increase in the earth’s average surface temperature."
				+ "\n2. The result of volcano explosion."
				+ "\n3. The result of the Moon moving far away from earth.");
		System.out.print("Your answer (1-3): ");
		answer = input.nextInt();
		switch(answer){
		case 1:
			this.totalPoints++;
			break;
		default:
			break;
		}
		
		System.out.println("\nQuestion 2\nHow much will sea level rise due to Global Warming this century?");
		System.out.println("1. 1-6 inches."
				+ "\n2. 7-23 inches."
				+ "\n3. 23-59 inches.");
		System.out.print("Your answer (1-3): ");
		answer = input.nextInt();
		switch(answer){
		case 2:
			this.totalPoints++;
			break;
		default:
			break;
		}
		
		System.out.println("\nQuestion 3\nWhich is the worst place to be affected by Global Warming?");
		System.out.println("1. The Arctic."
				+ "\n2. Australia."
				+ "\n3. Europe.");
		System.out.print("Your answer (1-3): ");
		answer = input.nextInt();
		switch(answer){
		case 1:
			this.totalPoints++;
			break;
		default:
			break;
		}
		
		System.out.println("\nQuestion 4\nHow many glaciers are left in the Montana Glacier National Park?");
		System.out.println("1. 100 instead of 150 in the year 1910."
				+ "\n2. 170 instead of 150 in the year 1910."
				+ "\n3. 25 instead of 150 in the year 1910.");
		System.out.print("Your answer (1-3): ");
		answer = input.nextInt();
		switch(answer){
		case 3:
			this.totalPoints++;
			break;
		default:
			break;
		}
		
		System.out.println("\nQuestion 5\nHow much carbon dioxide per year do human activities release?");
		System.out.println("1. 176 thousand tons."
				+ "\n2. 13 million tons."
				+ "\n3. 37 billion tons.");
		System.out.print("Your answer (1-3): ");
		answer = input.nextInt();
		switch(answer){
		case 3:
			this.totalPoints++;
			break;
		default:
			break;
		}
		
		input.close();
	}
}
