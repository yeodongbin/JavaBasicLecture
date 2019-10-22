package problem.homeworks;

public class ClassAa {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for (int i = 0; i < deck.cards.length - 1; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.print(deck.cards[deck.cards.length - 1]);
	}
}
