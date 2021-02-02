package starcraft;

public class Marine extends Soilder{
	
	Marine() {
		this.type = "Marine";
	}
	
	void stimpac() {
		this.hp--;
		this.attackLevel++;
	}
}
