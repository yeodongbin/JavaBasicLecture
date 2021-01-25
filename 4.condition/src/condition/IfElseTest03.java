package condition;
/*
���� ���� : 97	 >> score
����			>> grade
90�̻� A
80�̻� B
70�̻� C
70�̸� F

X5 : +
��� : ����� ������ 97�̹Ƿ� A+�����Դϴ�.
*/
public class IfElseTest03 
{
	public static void main(String[] args) {
		int score = 65;
		String grade;
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		if (((score % 10 >=5)&&(score >= 70)) || score == 100) {
			grade = grade + "+"; 
		}
		
		System.out.println("Score is " + grade );
	}
}
