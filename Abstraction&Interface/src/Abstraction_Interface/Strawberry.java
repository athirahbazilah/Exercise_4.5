package Abstraction_Interface;

public class Strawberry extends Fruit {
	
	private String colour;
	private int weight;
	
	public Strawberry() {
		
		super();
		colour = "-";
		weight = 0;
	}
	
	public Strawberry(String N, String C, int W) {
		super(N);
		colour = C;
		weight = W;
		
		if (this.weight == 7) {
			TotalWeight();
			System.out.println(name);
			System.out.println("If the total weight: " + TotalWeight() + " g. " + "Then it's just a small strawberry");
			
		}
		else if(this.weight == 12) {
			int Q = 12;
			TotalWeight(Q);
			System.out.println(name);
			System.out.println("If the total weight: " + TotalWeight(Q) + " g. " + "Then it have more than one strawberry");
			
		}
		else {
			int Q = 24;
			double M = 0.00029;
			TotalWeight(Q, M);
			System.out.println(name);
			System.out.println("If the total weight more than 12, then the total manganese: " + TotalWeight(Q, M) + " mg.");
			
		}
		
	}
	
	public int TotalWeight() {
		return weight;
	}
	
	public int TotalWeight(int Q) {
		return weight * Q;
	}
	
	public double TotalWeight(int Q, double M) {
		return (this.weight * Q) * M;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String printDetail() {
		return ("Strawberry contains a lot of manganese");
	}
	
	public String toString() {
		return super.toString() + ("\nStrawberry Constructor is Invoked" + "\nColour: " + colour + "\nWeight: " + weight + " g" + "\n" + printDetail());
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
