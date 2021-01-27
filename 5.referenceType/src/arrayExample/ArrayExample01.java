package arrayExample;

public class ArrayExample01 {

	public static void main(String[] args) {
		int[] arrInt = {90, 80, 70};
		int arrInt2[] = {90, 80, 70};
		//arrInt[0] = 90
		//arrInt[1] = 80
		//arrInt[2] = 70
		System.out.println("arrInt Length : " + arrInt.length);
		
		for (int i = 0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		arrInt[0] = 65;
		arrInt[1] = 75;
		arrInt[2] = 85;
		
		int sum = 0;
		for (int i = 0; i<arrInt.length; i++) {
			sum += arrInt[i];
			System.out.println(arrInt[i]);
		}
		
		System.out.println("sum : " + sum); 
		System.out.println("avg : " + (sum/arrInt.length));
		
		//==================================================
		
		int[] arrInt3;
		
		arrInt3 = new int[3];//Heap => |int|int|int|
		arrInt3[0] = 10;
		arrInt3[1] = 20;
		arrInt3[2] = 30;
		
		int[] arrInt4 = new int[4];//Heap => |null|null|null|null|
		System.out.println(arrInt4[0]);
		
		//==================================================
		
		String[] arrStr = {"hi","hello","world"};
		for (int i =0 ;i<arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}

	}

}
