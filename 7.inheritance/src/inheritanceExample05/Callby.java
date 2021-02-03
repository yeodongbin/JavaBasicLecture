package inheritanceExample05;

public class Callby {

	int x;
	
	Callby() {
		x = 10;
	}
	
	
	public void changeVar(int y) {
		y += y;
		System.out.println("changeVar: y = " + y);
		
	}
	
	public void changeRef(Callby callby) {
		callby.x = 100;
	}
	
		
	public static void main(String[] args) {
		Callby callby = new Callby();
		
		int y = 20;
		callby.changeVar(y);
		System.out.println("y = " + y);
		
		System.out.println("callby.x = " + callby.x);
		callby.changeRef(callby);
		System.out.println("callby.x = " + callby.x);
	}

}
