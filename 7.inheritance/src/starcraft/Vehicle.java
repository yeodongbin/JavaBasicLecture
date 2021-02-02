package starcraft;

public class Vehicle extends Units {
	int upgradeCount = 0;
	
	Vehicle () {
		this.hp = 200;
		this.mp = 0 ;
		this.attackLevel = 20;
		this.defenceLevel = 8;
	}
	
	void upgrade() {
		if (upgradeCount < 3) {
			this.attackLevel += 1;
			this.defenceLevel += 1;
			this.upgradeCount += 1;
			System.out.println("Upgrade Vehicle!!");
		} else {
			System.out.println("Full Upgraded!!");
		}
	}
}
