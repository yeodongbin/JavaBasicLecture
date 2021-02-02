package starcraft;

public class StarCraft {

	public static void main(String[] args) {
		Marine marine = new Marine();
		Firebet firebet = new Firebet();
		SCV scv = new SCV();
		
		System.out.println(firebet.hp);
		marine.attack(firebet);
		System.out.println(firebet.hp);
		marine.attack(scv);
		
		
		
	}

}
