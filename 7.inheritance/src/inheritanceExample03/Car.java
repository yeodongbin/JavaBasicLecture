package inheritanceExample03;

public class Car {

	private String color;
	private int account;

	public Car(String color, int account) {
		super();
		this.color = color;
		this.account = account;
	}

	@Override
	public String toString() {
		return "[����] : " + color + "\t[�������] : " + account;
	}

}
