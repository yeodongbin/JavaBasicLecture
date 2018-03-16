package condition;
public class ContinueTest {
	public static void main(String[] args) {
		while(true) {		
			int num = (int)(Math.random() * 10);

			if(num ==0) {
				System.out.println("0으로 나눌수 없다. 프로그램 종료!!");
				break;
			}

			if(num == 4) {
				System.out.println("4가 싫어욧!! : " + num);
				continue;
			}

			System.out.println("난수 : " + 10/num);
		}
	}
}
