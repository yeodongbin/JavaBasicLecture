package shoppingBasket;

public class Customer {
	Product[] product = new Product[5];
	private int money;
	int i = 0;

	Customer(int money) {
		this.money = money;
	}

	void buy(Product product) {
		if (this.money >= product.price) {
			this.product[i++] = product;
			this.money -= product.price;
		} else {
			System.out.println("no money!! ");
			System.out.println("your money : " + this.money);
		}

		if (i == this.product.length) {
			Product[] temp = new Product[i + 10];
			System.arraycopy(this.product, 0, temp, 0, this.product.length);
			this.product = temp;
		}
	}

	void total() {
		int sum = 0;
		for (int j = 0; j < i; j++) {
			sum = sum + product[j].price;
		}
		System.out.println(sum);
	}
	
	int getMoney() {
		return this.money;
	}
	
	void setMoney(int money) {
		this.money += money;
	}
}
