package problem;

public class Pro15 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = 
				memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id, password가 올바르지 않습니다.");
		}
	}
}

class MemberService {
	String MemberId = "hong";
	String MemberPW = "12345"; 
	boolean login(String id, String password) {
		boolean result = false;
		if (MemberId.equals(id)&&(MemberPW.equals(password))) {
			result = true;
		}
		
		return result;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
