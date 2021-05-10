package Abstraction_Interface;

public class HoneyDew extends Fruit {
	
	private char grade;
	private int ripe;
	
	public HoneyDew() {
		
		super();
		grade = '-';
		ripe = 0;
	}
	
	public HoneyDew(String N, char G, int R) {
		
		super(N);
		grade = G;
		ripe = R;
		
		if (this.ripe <= 20) {
			TotalRipe();
			System.out.println(name);
			System.out.println("If the Total Ripe: " + TotalRipe() + ". It's not Honey Dew fruit season yet");
			
		}
		else if (this.ripe > 20 && this.ripe <= 80) {
			int Rp = 25;
			TotalRipe(Rp);
			System.out.println(name);
			System.out.println("If the Total Ripe: " + TotalRipe(Rp) + ". It's Honey Dew fruit season!");
			
		}
		else {
			int Rp = 10;
			int Rt = 18;
			TotalRipe(Rp, Rt);
			System.out.println("If the Total Ripe: " + TotalRipe(Rp, Rt) + ". It's past Honey Dew fruit season");
		}
	}
	
	public int TotalRipe() {
		return ripe;
	}
	
	public int TotalRipe(int Rp) {
		return ripe + Rp;
	}
	
	public int TotalRipe(int Rp, int Rt) {
		return ripe + Rp - Rt;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public int getRipe() {
		return ripe;
	}
	
	public String printDetail() {
		return ("Honey Dew can reduce blood pressure");
	}
	
	public String toString() {
		return super.toString() + ("\nHoney Dew Constructor is Invoked" + "\nGrade: " + grade + "\nQuantity of Ripe: " + ripe + "\n" + printDetail());
	}

	@Override
	public double TotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double TotalPrice(double Pr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double TotalPrice(double Pr, double Disc) {
		// TODO Auto-generated method stub
		return 0;
	}

}
