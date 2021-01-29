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

		developer.name = "YEO";
		developer.career = 3;
		developer.type = DevType.WEB;

		System.out.println("name : " + developer.name);
		System.out.println("career : " + developer.career);
		System.out.println("type   : " + developer.type);
	}
}
