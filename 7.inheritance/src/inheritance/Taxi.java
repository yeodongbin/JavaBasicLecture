/*
1km당 100원
*/
package inheritance;

public class Taxi extends Car {
	
	int basicPrice;
	int totalPrice;

	public Taxi() {
		//super();
		basicPrice = 3000;
	}

	public Taxi(String carName, String carColor, String maker) {
		super(carName, carColor, maker);
		//this.carName = carName;
		//this.carColor = carColor;
		//this.maker = maker;
	}

	public int calcPrice(int km) {
		int price = basicPrice + km * 100;
		initPrice(price);
		return price;
	}

	private void initPrice(int price) {
		totalPrice += price;
	}

	@Override
	public String toString() {
		return super.toString() + "택시" ;
	}

	@Override
	public void speedUp() {
		//speed += 10;
		super.speedUp();
		if(speed >= 200)
			speed = 200;
	}

}

