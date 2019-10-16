package operator;

public class Jandon {

	public static void main(String[] args) {
		int money = 5500;
		
		int p1000, p500, p100, p50, p10;
		p1000 = money / 1000;
		p500 = (money%1000)/500;
		System.out.println(p500);

	}

}
