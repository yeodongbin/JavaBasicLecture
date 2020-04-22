package arrayExample;

public class ArrayLotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int i,j;
	       
	       for(i=0; i<lotto.length; i++){
	          lotto[i] = (int)((Math.random()*45)+1);
	          if(i>0){
	             for(j=0; j<i; j++){
	                while(lotto[i]==lotto[j]){
	                   lotto[i] = (int)((Math.random()*45)+1);
	                }
	             }
	          }
	       }
	}
}