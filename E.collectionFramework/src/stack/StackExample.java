package stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(100));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue());
		}
	}
}
class Coin {
	private int value;

	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}