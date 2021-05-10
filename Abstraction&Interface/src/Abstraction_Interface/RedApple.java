package Abstraction_Interface;

public class RedApple extends Apple {
	
	private String taste;
	private int calories;
	
	public RedApple() {
		
		super();
		taste = "-";
		calories = 0;
	}
	
	public RedApple(String N, int Q, double P, String T, int C) {
		super(N, Q, P);
		taste = T;
		calories = C;
		
	}
	
	public String taste() {
		return this.taste;
	}
	
	public int calories() {
		return this.calories;
	}
	
	public double calPrice() {
		return super.quantity * super.price;
	}
	
	public String printDetail() {
		return ("Red Apple can lower risk of diabetes");
	}
	
	public String toString() {
		return super.toString() + ("\nRed Apple Constructor is Invoked" + "\nTaste: " + taste + "\nCalories: " + calories + "\n" + printDetail());
	}

}
