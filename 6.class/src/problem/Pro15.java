package problem;

public class Pro15 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = 
				memberService.login("hong", "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id, password�� �ùٸ��� �ʽ��ϴ�.");
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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
}
