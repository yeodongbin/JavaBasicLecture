package inheritance.protectedKeyword;

import inheritance.finalKeyword.Car;

public class SportsCar2 extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//Override final impossible 
//	@Override
//	public final void stop() {
//		System.out.println("Car stop");
//		speed = 0;
//	}
	
	void carInstance() {
		super.speedUp();
	}
}
