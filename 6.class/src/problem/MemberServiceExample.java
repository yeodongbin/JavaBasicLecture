package problem;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = ms.login("hong","12345");
		if (result) {
			System.out.println("login �Ϸ�");
		} else {
			System.out.println("login ����");
		}
	}
}
class MemberService {
	String id;
	String password;
	
	MemberService() {
		id = "hong";
		password ="12345";
	}
	
	boolean login(String _id, String _password) {
		boolean result = false;
		if ((id.equals(_id))&&
				(password.equals(_password))) {
			result = true;	
		} 
		return result;
	}
}