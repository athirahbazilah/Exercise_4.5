package Abstraction_Interface;

public abstract class Fruit {
	
	protected String name;
	
	public Fruit() { //constructor with no argument
		name = "-";
	}
	
	public Fruit(String N) { //constructor with argument
		this.name = N;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String printDetail() { //overriding with parameter
		return ("Fruit contains a lot of vitamins");
	}
	
	public String toString() { //overriding method
		return ("Name: " + name + "\nFruit Constructor is Invoked");
	}
	
	public abstract double TotalPrice();
	public abstract double TotalPrice(double Pr);
	public abstract double TotalPrice(double Pr, double Disc);

}
