package classExample;

public class CalculatorStatic {

	public static void main(String[] args) {
//		Calculator2 cal2 = new Calculator2();
//		Calculator2 cal3 = new Calculator2();
//		Calculator2 cal4 = new Calculator2();
//		cal2.plus(10,20);
//		cal3.plus(10,20);
//		cal4.plus(10,20);
		Calculator2.plus(10, 20);
		
	}
}

class Calculator2 {
	static final double pi = 3.14; //»ó¼ö
//	static double pi = 3.14;
	
	static int plus(int x, int y) {
//		pi = 0.111;
		return x + y;
	}
}
