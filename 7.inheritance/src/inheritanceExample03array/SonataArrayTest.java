package inheritanceExample03array;

public class SonataArrayTest {

	public static void main(String[] args) {
		Sonata[] sonata = new Sonata[4];
		sonata[0] = new Sonata("Black", 1111, "NF", "Yeo");
		sonata[1] = new Sonata("White", 1112, "YF", "Yeo");
		sonata[2] = new Sonata("Black", 1113, "EF", "Yeo");
		sonata[3] = new Sonata("Gray", 1114, "BF", "Yeo");
		
		for (Sonata s : sonata) {
			System.out.println(s);
		}
	}
}
