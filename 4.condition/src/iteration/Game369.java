package iteration;

public class Game369 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 41; i++) {
			int temp = i;
			int temp10  = i/10;
			int temp1   = i%10;
			String clap = "";
			
			if ((temp10 %3 ==0)&&(temp10 != 0)) {
				clap += "¦"; 
				if ((temp1 % 3 == 0)&&(temp1 != 0)) {
					clap += "¦"; 
				}
			} else {
				if ((temp1 % 3 == 0)&&(temp1 != 0)) {
					clap += "¦"; 
				}	
			}
			
			if (clap.length()>0) {
				System.out.print(clap + " ");
			} else {
				System.out.print(i + " ");
			}
		}//End for
		
//		for (int i = 1; i < 41; i++) {
//		int temp  = i;
//		boolean flagShowNum = true;
//		
//		for (;temp!=0;) {
//			int condition = temp % 10;
//			if (condition %3 == 0 && condition!= 0) {
//				System.out.print("¦");
//				flagShowNum = false;
//			}
//			temp /= 10;
//		}
//				
//		if (flagShowNum) {
//			System.out.print(i+" ");
//		} else {
//			System.out.print(" ");
//		}
//		}//End for
		

	}
}