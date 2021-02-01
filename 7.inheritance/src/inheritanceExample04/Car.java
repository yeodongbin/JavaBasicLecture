
/*
class : �ڵ��� Car
�Ӽ� :	�̸� >> String carName	
		���� >>	String carColor
		������ >> String maker
		�ӵ� >> int speed
       

��� :	���� >> public void speedUp()
		���� >> void speedDown()
		���� >> void stop()
*/

package inheritanceExample04;

public class Car {
	
	String carName;
	String carColor;
	String maker;
	int speed;

	public Car() {
		this("�Ÿ", "������", "����");
	}

	public Car(String carName) {
		this(carName, "���", "���");
	}

	public Car(String carName, String carColor) {
		this(carName, carColor, "���");
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
		return maker + "���� ���� " + carColor + " " + carName ;
	}

}
