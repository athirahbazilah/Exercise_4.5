package Abstraction_Interface;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("***************APPLE***************");
		Apple objApple = new Apple("Apple", 150, 1.2);
		System.out.println(objApple);
		System.out.println();
		
		System.out.println("***************STRAWBERRY***************");
		Strawberry objStraw = new Strawberry("Strawberry", "Red", 18);
		System.out.println(objStraw);
		System.out.println();
		
		System.out.println("***************HONEY DEW***************");
		HoneyDew Melon = new HoneyDew("Honey Dew", 'B', 30);
		System.out.println(Melon);
		System.out.println();
		
		System.out.println("***************AVOCADO***************");
		Avocado objAvo = new Avocado("Avocado", 10, 1.8, 3);
		System.out.println(objAvo);
		System.out.println();
		
		System.out.println("***************RED APPLE***************");
		RedApple objRed = new RedApple("Red Apple", 15, 2, "Sweet", 95);
		System.out.println(objRed);
		System.out.println();
		
		System.out.println("***************GREEN APPLE***************");
		GreenApple objGreen = new GreenApple("Green Apple", 20, 4, 'Y', 1);
		System.out.println(objGreen);

	}

	

}
