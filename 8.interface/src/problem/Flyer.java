package problem;

public interface Flyer {
	int fast = 100;

	void fly();

	boolean isAnimal();
}

class FlyerUtil {

	static void show(Flyer flyer) {
		flyer.fly();
		flyer.isAnimal();
	}

}

class Bird implements Flyer {
	@Override
	public boolean isAnimal() {
		System.out.println("true");
		return true;
	}

	@Override
	public void fly() {
		System.out.println("Bird flying");
	}
}

class Airplane implements Flyer {
	@Override
	public boolean isAnimal() {
		System.out.println("false");
		return false;
	}

	@Override
	public void fly() {
		System.out.println("Airplane flying");
	}
}
