package starCraft;

public class StarCraft {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.attack(m2);
		System.out.println("m1 hp: "+ m1.hp);
		System.out.println("m2 hp: "+ m2.hp);
		m1.attack(m2);
		m1.attack(m2);
		System.out.println("m1 hp: "+ m1.hp);
		System.out.println("m2 hp: "+ m2.hp);
		m2.attack(m1);
		System.out.println("m1 hp: "+ m1.hp);
		System.out.println("m2 hp: "+ m2.hp);
		m1.stimpack();
		m1.attack(m2);
		System.out.println("m1 hp: "+ m1.hp);
		System.out.println("m2 hp: "+ m2.hp);
		
		

	}

}
