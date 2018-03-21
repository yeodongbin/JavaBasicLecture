package threadStateControl.sleep;

//import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		//Toolkit toolkit = Toolkit.getDefaultToolkit();

		for(int i=0; i<10; i++) {
		//	toolkit.beep();
			System.out.println("¶¯");
			try {
				Thread.sleep(3000); //3ÃÊ
			} catch(InterruptedException e) {
			}
		}
	}
}
