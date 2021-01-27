package problem;

import java.util.Scanner;

public class TwentyPass {

	public static void main(String[] args) {

		int question =0;
		int anwser = 0;
		int chance = 5;
		boolean isChance = true;
		
		question = (int)(Math.random()*100) +1;
		System.out.println(question);
		
		while(isChance) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Anwser > ");
			anwser = sc.nextInt();
			chance--;
			
			if (question > anwser) {
				System.out.print(" UP !!!");
				System.out.println(" - chance : "+chance);
			} else if (question < anwser) {
				System.out.print(" Down !!!");
				System.out.println(" - chance : "+chance);
			} else if (question == anwser) {
				System.out.println(" Corrent :" + anwser);
				isChance = false;
				break;
			}
			
			if (chance == 0) {
				System.out.println(" Your Chance is 0 !!");
				isChance = false;
				break;
			}
		}
	}

}
