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

		developer.name = "ȫ�浿";
		developer.career = 3;
		developer.type = DevType.WEB;

		System.out.println("������ �̸� : " + developer.name);
		System.out.println("������ ��� : " + developer.career);
		System.out.println("������Ʈ     : " + developer.type);
	}
}
