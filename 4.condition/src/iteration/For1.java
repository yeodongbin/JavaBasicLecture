package iteration;
public class For1 {
	public static void main(String[] args) {
		System.out.println("1 - 10���� ����Ͻÿ�.");//1 2 3 4 .. 10
		for(int i=1;i<11;i++) {
			System.out.print(i + "\t");
		}
		
		//System.out.println();
		//System.out.print("\n");
		System.out.println("\n0 - 10������ ¦�� ����Ͻÿ�.");//0 2 4 6 8 10
		for(int i=0;i<11;i++) {
			if(i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.print("\n------------------------------\n");
		for(int i=0;i<11;i+=2) {
			System.out.print(i + "\t");
		}
		System.out.println("\n1 - 10������ ���� �Ųٷ� ����Ͻÿ�.");//10 9 8 7 ... 2 1
		for(int i=10;i>0;i--) {
			System.out.print(i + "\t");
		}
	}
}
