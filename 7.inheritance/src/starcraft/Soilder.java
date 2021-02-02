package starcraft;

public class Soilder extends Units{
	Soilder() {
		this.hp = 90;
		this.mp = 10 ;
		this.attackLevel = 10;
		this.defenceLevel = 5;
	}
	
	void attack(Units unit) {
		unit.hp = unit.hp - (this.attackLevel - unit.defenceLevel);
		System.out.println(this.type + " attacks " + unit.type);
	}
	

}
