package condition;

public class IDcodeCheck {

	public static void main(String[] args) {
		int code = 31; //남성 내국인
		String idCheck = "";
		
		if (code / 10 == 1) {// 여성
			idCheck = "여성";
			if (code % 10 == 1) { // 내국인
				idCheck = idCheck + ", 내국인";
			} else if (code % 10 == 2) { // 외국인
				idCheck = idCheck + ", 외국인";
			} else if (code % 10 == 3) { // 미성년자
				idCheck = idCheck + ", 미성년자";
			} else {
				idCheck = "정확한 정보를 입력하세요.";
			}
		}
		if (code / 10 == 2) {// 남성
			idCheck = "남성";
			if (code % 10 == 1) { // 내국인
				idCheck = idCheck + ", 내국인";
			} else if (code % 10 == 2) { // 외국인
				idCheck = idCheck + ", 외국인";
			} else if (code % 10 == 3) { // 미성년자
				idCheck = idCheck + ", 미성년자";
			} else {
				idCheck = "정확한 정보를 입력하세요.";
			}
		} else {
			idCheck = "정확한 정보를 입력하세요.";
		}
		
		System.out.println(idCheck);
	}

}
