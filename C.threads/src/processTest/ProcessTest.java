package processTest;

import java.io.IOException;

public class ProcessTest {
	public static void main (String[] args) throws Exception{
		Runtime r = Runtime.getRuntime();
		Process p= r.exec("mspaint.exe");
		Thread.sleep(100);
		p.destroy();
	}
}
