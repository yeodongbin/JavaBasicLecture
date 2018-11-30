package conditionLoopFunction.homework;

public class Ex03 {

	public static void main(String[] args) {
		  //3의 배수의 합
	      int sum =0;
	      int i =0;
	      
	      for( i=1; i<=100;i++) {
	         if(i%3==0) {
	            sum=sum+i;
	         }            
	      }
	      System.out.println("3의 배수의 합:"+sum);
	}
	
	

}
