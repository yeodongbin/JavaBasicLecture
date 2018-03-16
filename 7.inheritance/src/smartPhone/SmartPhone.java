package smartPhone;

public class SmartPhone {
	private String maker;
	private String name;
	private int price;
	private int discountRate;

	public SmartPhone(String maker, String name, int price) {
		super();
		this.maker = maker;
		this.name = name;
		this.price = price;
	}

	public SmartPhone(String maker, String name, int price, int discountRate) {
		super();
		this.maker = maker;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}

	public int calculateDiscount() {
		return price * (100 - discountRate) / 100;
	}

	public String getMaker() {
		return maker;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

}












