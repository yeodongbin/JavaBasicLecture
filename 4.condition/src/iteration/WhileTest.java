package iteration;
public class WhileTest {
	public static void main(String[] args) {
		System.out.println("1 - 10���� ���(while)");
		int x = 1;
		while(x < 11) {
			System.out.print(x++ + "\t");
		}

		System.out.println("\n\n**** ������(while) *****");
		int dan = 2;
		while(dan < 10) {
			//System.out.println("���������???");
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
