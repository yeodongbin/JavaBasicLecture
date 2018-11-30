package finalKeyword;

//public final class Car {
public class Car {
	public int speed;
	
	protected void speedUp() {
		speed += 1;
	}
	
	public final void stop() { //method final 
		System.out.println("Car stop");
		speed = 0;
	}	
}