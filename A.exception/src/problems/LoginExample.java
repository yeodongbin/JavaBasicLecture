package problems;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("Blue","54321");		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password)    {
		if (!id.equals("minho")) {
			//throw new IDException("wrong ID~");
		}
		
		if (!password.equals("12345")) {
			//
		}
	}
}
