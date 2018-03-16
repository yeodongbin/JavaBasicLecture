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
public class SwitchTest3 {
	public static void main(String[] args) {
		int score = 100;
		String grade = "A";

		switch(score / 10) {
			case 10 : case 9 : grade = "A";break;
			case 8 : grade = "B";break;
			case 7 : grade = "C";break;
			default : grade = "F";break;
		}

		if(score % 10 >= 5 && score >= 70 || score == 100) 
			grade += "+";

		System.out.println("당신의 점수는 " + score + "이므로 " + grade + "학점입니다.");
	}
}
