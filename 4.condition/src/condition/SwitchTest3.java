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

		System.out.println("����� ������ " + score + "�̹Ƿ� " + grade + "�����Դϴ�.");
	}
}
