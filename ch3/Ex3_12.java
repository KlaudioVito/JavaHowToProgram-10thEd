package ch03;

public class Ex3_12 {
	private String number, description;
	private int quantity;
	private double price;
	
	public Ex3_12(String number, String description, int quantity, double price){
		this.number = number;
		this.description = description;
		if(quantity > 0)
			this.quantity = quantity;
		if(price > 0)
			this.price = price;
	}
	
	public void setNumber(String number){
		this.number = number;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public void setQuantity(int quantity){
		if(quantity > 0)
			this.quantity = quantity;
		else 
			this.quantity = 0;
	}
	
	public void setPrice(double price){
		if(price > 0)
			this.price = price;
		else
			this.price = 0;
	}
	
	public String getNumber(){
		return this.number;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public int getQuantity(){
		if(this.quantity > 0)
			return this.quantity;
		else
			return 0;
	}
	
	public double getPrice(){
		if(this.price > 0)
			return this.price;
		else
			return 0;
	}
	
	public double getInvoiceAmount(){
		if(this.quantity == 0 || this.price == 0)
			return 0.0;
		else
			return (this.quantity * this.price);
	}
}
