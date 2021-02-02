package inheritanceExample02;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = SUPERSONIC;
	
	public SupersonicAirplane() {
		super();
	}
	
	//Overload
	public void fly(String arrive) {}
	
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("SuperSonic Flying~");
		} else {
			super.fly();
			System.out.println(super.type);
		}
	}
}
