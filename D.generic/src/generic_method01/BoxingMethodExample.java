package generic_method01;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();

		Box<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
	}// main
}
