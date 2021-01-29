package method_call;

public class Calculator {

	int x, y;
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		int sum = plus(x,y);
		double avg = sum / 2.0;
		return avg;
	}
	
	void execute() {
		Calculator cal = new Calculator();
		double result = avg(x,y);
		System.out.println("Exectue : " + result);
	}
	
	void execute(int x) { //overload
		Calculator cal = new Calculator();
		double result = avg(x,y);
		System.out.println("Exectue : " + result);
	}
	
	Calculator() {
		System.out.println("Calculator()");
	}
	
	Calculator(int x) {
		//this(x) //X
		this.x = x;
		System.out.println("Calculator(x)");
	}
	Calculator(int x, int y) {
		//this.x = x;
		this(x); //method(constructor) call
		this.y = y;
		System.out.println("Calculator(x, y)");
		execute();//method call
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator(7,10);
		//cal.execute(); //O
	}

}