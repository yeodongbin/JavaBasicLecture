package iteration;
public class WhileTest {
	public static void main(String[] args) {
		//while (조건식) {실행문}
		int x = 1;
		while(x < 11) {
			System.out.print(x++ + "\t");
		}
		int dan = 2;
		while(dan < 10) {
			
			int i = 1;
			while(i < 10) {
				System.out.print(dan + " * " + i + " = " + dan * i + "\t");
				i++;
			}
			dan++;
			System.out.println();
		}
	}
}
