package processTest;

import java.io.IOException;

public class ProcessTest {
	public static void main (String[] args) throws Exception{
		Runtime r = Runtime.getRuntime();
		Process p= r.exec("calc.exe");
		Thread.sleep(100);
		p.destroy();
	}
}
