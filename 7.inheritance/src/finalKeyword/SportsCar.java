package inheritance.finalKeyword;

public class SportsCar extends Car {
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
}
