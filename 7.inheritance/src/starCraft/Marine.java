package inheritance.starCraft;

public class Marine extends Soilder{
	void stimpack() {
		super.power = 20;
		super.hp -= 10;
	}
}
