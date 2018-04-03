package enumType;

public class EnumInnerClass {
	public String name;
	public int career;
	public DevType type;

	public enum DevType {
		MOBILE, WEB, SERVER
	}

	public static void main(String[] args) {
		EnumInnerClass developer = new EnumInnerClass();

		developer.name = "홍길동";
		developer.career = 3;
		developer.type = DevType.WEB;

		System.out.println("개발자 이름 : " + developer.name);
		System.out.println("개발자 경력 : " + developer.career);
		System.out.println("직무파트     : " + developer.type);
	}
}
