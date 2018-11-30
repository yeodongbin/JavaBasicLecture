package class_object.homework;

public class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i + 1;
			boolean isKwang = false;

			int t = num;
			while (t > 0) {
				t %= 10;
				if (t % 3 == 0 && t != 0) {
					isKwang = true;
					break;
				}

				num /= 10;
				t = num;
			}
			num = i + 1;

			cards[i] = new SutdaCard(num, isKwang);
		}
	}
}
