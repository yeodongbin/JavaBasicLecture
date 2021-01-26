package iteration;
public class Break_Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 101 ; i++) {
			if (i == 5) {
				System.out.print("continue!! ");
				continue;
			}
			
			System.out.print(i + " ");
			
			if (i == 10) {
				System.out.print("break!");
				break;
			}
		}
	}
}
