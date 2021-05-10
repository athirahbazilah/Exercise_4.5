package Abstraction_Interface;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	
	public Apple() { //constructor for sub class
		
		super(); //inherit from super class (constructor with no argument)
		quantity = 0;
		price = 0;
	}
	
	public Apple(String N, int Q, double P) { //constructor sub class with argument
		
		super(N); //called method in superclass with passing parameter
		quantity = Q;
		price = P;
		
		if (this.quantity < 10) {
			TotalPrice();
			System.out.println(name);
			System.out.println("Price per unit: RM " + P);
			System.out.println("Total Price: RM " + TotalPrice());
			
		}
		else if (this.quantity > 10 && this.quantity < 100) {
			double Pr = 1.00;
			TotalPrice(Pr);
			System.out.println(name);
			System.out.println("Price per unit: RM " + Pr);
			System.out.println("Total Price: RM " + TotalPrice(Pr));
			
		}
		else {
			double Pr = 0.8;
			double Disc;
			
			Discount d = new AppleDiscount(); //new object
			Disc = d.discountRate(); //discount rate
			TotalPrice(Pr, Disc); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("Price per unit: RM " + Pr);
			System.out.println("Discount Rate: " + d.discountRate() * 100 + " %");
			System.out.println("Total Price: RM " + TotalPrice(Pr, Disc));
			
		}
	}
	
	public double TotalPrice() { //overloading with no argument
		return this.quantity * this.price;
	}
	public double TotalPrice(double Pr) { //overloading with one argument
		return this.quantity * Pr;
	}
	
	public double TotalPrice(double Pr, double Disc) { //overloading with 2 argument
		return (this.quantity * Pr) - (this.quantity * Pr * Disc);
	}
	
	public String printDetail() { 
		return ("Apple can lower high cholesterol");
	}
	
	public String toString() {
		return super.toString() + "\n" + printDetail();
	}

}
