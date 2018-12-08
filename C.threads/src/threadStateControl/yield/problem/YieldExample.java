package threadStateControl.yield.problem;

public class YieldExample {

	 public static void main(String[] args) {
	      ThreadA a = new ThreadA();
	      ThreadB b = new ThreadB();
	      
	      a.start();
	      b.start();
	
	   }

}
