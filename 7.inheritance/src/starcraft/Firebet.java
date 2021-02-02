package starcraft;

public class Firebet extends Soilder{
	
	Firebet() {
		this.type = "Firebet";
	}
	
	
	void stimpac() {
		this.hp--;
		this.attackLevel++;
	}
}
