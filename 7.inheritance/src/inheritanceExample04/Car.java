
/*
class : 자동차 Car
속성 :	이름 >> String carName	
		색상 >>	String carColor
		제조사 >> String maker
		속도 >> int speed
       

기능 :	가속 >> public void speedUp()
		감속 >> void speedDown()
		정지 >> void stop()
*/

package inheritance_taxi;

public class Car {
	
	String carName;
	String carColor;
	String maker;
	int speed;

	public Car() {
		this("쏘나타", "검정색", "현대");
	}

	public Car(String carName) {
		this(carName, "흰색", "기아");
	}

	public Car(String carName, String carColor) {
		this(carName, carColor, "기아");
	}

	public Car(String carName, String carColor, String maker) {
		
		this.carName = carName;
		this.carColor = carColor;
		this.maker = maker;
	}

	void speedUp() {
		speed += 10;
	}

	void speedDown() {
		speed -= 10;
		if(speed <= 0)
			this.stop();
	}

	void stop() {
		speed = 0;
	}

	@Override
	public boolean equals(Object obj) {//c1.equals(c2)
		Car car = (Car) obj;
		if(carName.equals(car.carName))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return maker + "에서 만든 " + carColor + " " + carName ;
	}

}
