package access_modifier01;

public class SCV { //default
public SCV() {}
	
	private int hp = 100;
	private int mp = 0;
	private int defence = 5;
	private int attack = 5;
	
	public int getHP() { //getter
		return hp;
	}
	
	public void attack(SCV scv) { //setter
		scv.hp--;
	}
	
	public void check() { //getter
		System.out.println("Defence Level : " + defence);
		System.out.println("Attack Level : " + attack);
	}
}
