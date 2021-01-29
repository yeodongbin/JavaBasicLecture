package classExample;

public class FieldInit {
	byte byteField;
	short shortField;
	int intField;
	long longField;

	float floatField;
	double doubleField;

	char charField;
	boolean boolField;

	String stringField;
	int[] arr;
	FieldInit classField;

	public static void main(String[] args) {
		FieldInit f = new FieldInit();
		System.out.println("byte: " + f.byteField);
		System.out.println("short: " + f.shortField);
		System.out.println("int: " + f.intField);
		System.out.println("long: " + f.longField);

		System.out.println("float: " + f.floatField);
		System.out.println("double: " + f.doubleField);

		System.out.println("char: " + f.charField);
		System.out.println("boolean: " + f.boolField);

		System.out.println("String :" + f.stringField);
		System.out.println("int[] :" + f.arr);
		System.out.println("Field :" + f.classField);
	}

}