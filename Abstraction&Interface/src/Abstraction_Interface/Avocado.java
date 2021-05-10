package Abstraction_Interface;

public class Avocado extends Apple {
	
private int rotten;
	
	public Avocado() {
		
		super();
		rotten = 0;
	}
	
	public Avocado(String N, int Q, double P, int R) {
		
		super(N, Q, P);
		rotten = R;
		
		if (this.rotten < 5) {
			TotalGood();
			System.out.println("If the total good: " + TotalGood() + " The fruit are still fresh!");
			
		}
		else if (this.rotten > 5 && this.rotten < 50) {
			int smell = 10;
			TotalGood(smell);
			System.out.println("If the total good: " + TotalGood() + " The fruit starting to go bad");
			
		}
		else {
			int smell = 30;
			int moldy = 8;
			TotalGood(smell, moldy);
			System.out.println("If the total good: " + TotalGood() + " The fruit really in bad conditions");
		}
		
	}
	
	public int getRotten() {
		return rotten;
	}
	
	public int TotalGood() {
		return quantity - rotten;
	}
	
	public int TotalGood(int smell) {
		return quantity - (rotten + smell);
	}
	
	public int TotalGood(int smell, int moldy) {
		return quantity - (rotten + smell + moldy);
	}
	
	public double calPrice() {
		return super.quantity * super.price - (rotten * quantity);
	}
	
	public String printDetail() {
		return ("Avocado can protect heart disease");
	}
	
	public String toString() {
		return super.toString() + ("\nAvocado Constructor is Invoked" + "\nQuantity Rotten: " + rotten + "\n" + printDetail());
	}

}
