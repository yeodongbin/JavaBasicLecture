package iteration;
public class ForFor2Gugudan2 {
	public static void main(String[] args) {
		System.out.println("*** 구구단 ***");
		for(int dan=2;dan<10;dan++) {
			for(int i=1;i<10;i++) {
				System.out.print(dan + " * " + i + " = " + dan * i + "\t");
			}
			System.out.println();
		}
	}
}
