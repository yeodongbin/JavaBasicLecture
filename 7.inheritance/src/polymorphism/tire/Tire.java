package polymorphism.tire;

public class Tire {
	int maxRotation;
	int accumlatedRoatation;
	String location;
	
	Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	boolean roll() {
		accumlatedRoatation++;
		if (accumlatedRoatation < maxRotation) {
			return true;
		} else {
			System.out.println(location +" Ÿ�̾ ��ü���ּ���");
			return false;
		}
	}
}
