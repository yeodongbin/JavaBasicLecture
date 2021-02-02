package starcraft;

public class Worker extends Units {
	Worker() {
		this.hp = 50;
		this.mp = 0 ;
		this.attackLevel = 5;
		this.defenceLevel = 0;
	}
	
	void mine(int x, int y) {
		System.out.println("Mining : " 
	          + x + ", " + y);
	}
}
