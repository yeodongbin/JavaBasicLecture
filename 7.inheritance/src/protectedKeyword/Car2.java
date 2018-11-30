package inheritance.protectedKeyword;

import inheritance.finalKeyword.*;

//public final class Car {
public class Car2 {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() { //method final 
		System.out.println("Car stop");
		speed = 0;
	}
	
	public void carInstance() {
		Car car = new Car();
		//car.speedUp();
	}
}