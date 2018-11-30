package inheritance.starCraft;

public class Unit {
	int hp;
	int mp;
	int power;
	int speed;
	String type;
	
	Unit(String type) {
		this.type = type;
	}
	void move(int x, int y) {
		System.out.println("x축:" + x + ", y축:" + y + "로 이동합니다.");
	}
}
