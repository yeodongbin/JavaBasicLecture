package classExample;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car("SUV", "Genesis");
		System.out.println(mycar.type);
		System.out.println(mycar.model);
		System.out.println();
		
		Car yourCar = new Car();
		System.out.println(yourCar.type);
		System.out.println(yourCar.model);
		yourCar.company = "BMW";
		yourCar.model = "M Series";
		
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
	}
}

class Car {
	String company = "hundai";
	String model = "Genesis";
	String color = "White";
	String type = "Sedan";
	int maxSpeed = 200;
	int speed;
	
	Car(String _model) {
		model = _model;
	}
	
	Car(String _company, String _model) {
		company = _company;
		model = _model;
	}
	
	Car() {}; //Default Constructor
}