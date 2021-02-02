package starcraft;

public class Units {
	int x,y;
    int hp;
    int mp;
    int attackLevel;
    int defenceLevel;
    String type;
    void move(int x, int y) {
    	System.out.println("Location: " 
    			+ x + ", " + y);
    };
}
