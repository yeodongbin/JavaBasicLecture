package inheritanceExample;

public class Call {
	
	int x;

	public Call() {
		x = 10;
	}
	
	public void changeVar(int y) {
		y += y;
		System.out.println("call y === " + y);//60
	}

	public void changeRef(Call c) {
		c.x = 80;
	}

}
