package enumType;

public class EnumConn {

	public String name;
	public int career;
	public DevType type;

	public static void main(String[] args) {

		for (DevType type : DevType.values()) {
			System.out.println(type.getName());
		}

	}// main
}// EnumConn

enum DevType {

	// 상수("연관시킬 문자") <- 이땐 줄 끝에 세미콜론 (;) 붙이기.
	MOBILE(12345), WEB(1234), SERVER(123);

	final private int name;

	private DevType(int name) {
		this.name = name;
	}
	public int getName() {
		return name;
	}


} //enum
