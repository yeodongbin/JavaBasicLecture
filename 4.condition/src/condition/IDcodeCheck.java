package condition;

public class IDcodeCheck {

	public static void main(String[] args) {
		int code = 31; 
		String idCheck = "";
		
		if (code / 10 == 1) {
			idCheck = "남자";
			if (code % 10 == 1) {
				idCheck = idCheck + ", 관리자";
			} else if (code % 10 == 2) { 
				idCheck = idCheck + ", 사용자";
			} else if (code % 10 == 3) { 
				idCheck = idCheck + ", 구경꾼";
			} else {
				idCheck = "ERROR !!!!";
			}
		}
		if (code / 10 == 2) {
			idCheck = "여자";
			if (code % 10 == 1) { 
				idCheck = idCheck + ", 관리자";
			} else if (code % 10 == 2) { 
				idCheck = idCheck + ", 사용자";
			} else if (code % 10 == 3) { 
				idCheck = idCheck + ", 구경꾼";
			} else {
				idCheck = "ERROR !!!!";
			}
		} else {
			idCheck = "ERROR !!!!";
		}
		
		System.out.println(idCheck);
	}

}
