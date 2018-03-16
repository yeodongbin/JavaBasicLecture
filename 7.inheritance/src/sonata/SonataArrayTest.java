package sonata;

public class SonataArrayTest {

	public static void main(String[] args) {
		Sonata sonata[] = new Sonata[4];
		sonata[0] = new Sonata("흰색", 5000, "NF", "승용");
		sonata[1] = new Sonata("은색", 7000, "Brilliant", "업무");
		sonata[2] = new Sonata("감홍색", 4000, "EF", "택시");
		sonata[3] = new Sonata("검정색", 6000, "하이브리드", "승용");

		int len = sonata.length;
		for (int i = 0; i < len; i++) {
			System.out.println(sonata[i]);
		}
	}
}
