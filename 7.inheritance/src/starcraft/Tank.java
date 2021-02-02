package starcraft;

public class Tank extends Vehicle{
	
	static final int NORMAL = 1;
	static final int SIEGE = 2;
	
	private int mode;
	
	Tank() {
		this.mode = NORMAL;
	}
	
	void chanageMode() {
		this.mode = (this.mode == NORMAL) ? SIEGE : NORMAL;
	}

}
