package condition;
/*
시험 점수 : 97	 >> score
학점			>> grade
90이상 A
80이상 B
70이상 C
70미만 F

X5 : +
출력 : 당신의 점수는 97이므로 A+학점입니다.
*/
public class IfElseIfTest {
	public static void main(String[] args) {
		int score = 97;
		String grade = "";
		if(score >= 90) 
			grade = "A";
		else if(score >= 80) 
			grade = "B";
		else if(score >= 70) 
			grade = "C"; 
		else 
			grade = "F";
				
		if(score % 10 >= 5 && score >= 70 || score == 100) 
			grade += "+";

		System.out.println("당신의 점수는 " + score + "이므로 " + grade + "학점입니다.");
		
	}
}
