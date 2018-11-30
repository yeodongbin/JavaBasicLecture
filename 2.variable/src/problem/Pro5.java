package problem;

public class Pro5 {

	public static void main(String[] args) {
		int value = 356;
		int p100;
		int p10;
		int p1;
		
		p100 = value / 100;
		p10 = (value-(100*p100)) / 10; 
		p1 = value % 10; //356
		
		System.out.println("p100 : " + p100);
		System.out.println("p10 : " + p10);
		System.out.println("p1 : " + p1);
	
		
		
		
	}

}
