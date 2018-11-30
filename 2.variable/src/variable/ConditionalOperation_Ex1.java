package variable_type;

public class ConditionalOperation_Ex1 {

	public static void main(String[] args) {
		int score = 85;
		char grade = 'D';
		
		grade = (score >= 90)? 'A': (
				(score >= 80)? 'B': (
				(score >= 70)? 'C': 'D'));

		System.out.println(grade);
	}
}
