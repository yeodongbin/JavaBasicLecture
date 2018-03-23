package variable;

public class VariableTest {

	public static void main(String[] args) {

		int var1 = 10;
		System.out.println(var1);

		int var2 = 010;
		System.out.println(var2);

		int var3 = 0x10;
		System.out.println(var3);

		// 10을 변수 value의 초기값으로 저장
		int value = 10;
		// 변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);

		//변수 구역
		int var4;
		if (true) {
			int var5;

			var4 = 10;
			var5 = 20;
		}

		var4 = 10;
		for (int i = 0; i < 1; i++) {
			int var6;

			var4 = 10;
		}
		var4 = 10;

		//VariableScope
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;  //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김

		//p38
		/////////////////////////////////////////////////////
		boolean flag = true;
		System.out.println("1. >>>>>" + flag);

		flag = false;
		System.out.println("2. >>>>>" + flag);

		char c = '0';
		System.out.println("c =====  " + c + "\t6" + (int) c);

		int age = 20;
		System.out.println("\t\t : " + (age + 5));

		boolean b;

		if (age < 30) {
			b = true;
		} else {
			b = false;
		}

		System.out.println("b ==== " + b);
	}
}
