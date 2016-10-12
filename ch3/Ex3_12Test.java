package ch03;

import java.util.Scanner;

public class Ex3_12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_12 invoice = new Ex3_12("123456789", "This is handle for the gate", 12, 5.99);
		showInvoice(invoice);
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nSet item number: ");
		String number = input.nextLine();
		invoice.setNumber(number);
		
		System.out.print("Set item description: ");
		String description = input.nextLine();
		invoice.setDescription(description);
		
		System.out.print("Set item quantity: ");
		int quantity = input.nextInt();
		invoice.setQuantity(quantity);
		
		System.out.print("Set item price: $");
		double price = input.nextDouble();
		invoice.setPrice(price);
		
		System.out.println();
		showInvoice(invoice);
		input.close();
	}
	
	private static void showInvoice(Ex3_12 invoice){
		System.out.println("Invoice #" + invoice.getNumber());
		System.out.println("Description: " + invoice.getDescription());
		System.out.println("Quantity: " + invoice.getQuantity());
		System.out.println("Price: $" + invoice.getPrice());
		System.out.println("Invoice ammount: $" + invoice.getInvoiceAmount());
	}

}
