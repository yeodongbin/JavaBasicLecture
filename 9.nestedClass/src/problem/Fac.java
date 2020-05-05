package problem;

public class Fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int fac(int n) {
		if (n==1) {
			return n;
		} else {
			return fac(n-1) * n;
		}
	}

}
