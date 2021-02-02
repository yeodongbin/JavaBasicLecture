package inheritanceExample03array;

public class Car {

	private String color;
	private int number = 0;
	
	public Car(String color, int number) {
		this.color = color;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Color : " + color + "\tNumber : " + number;
	}
}
