package inheritanceExample;

public class CallTest {
	public static void main(String[] args) {

		Call call = new Call();
		System.out.println(call.x);//10

		int z = 30;
		call.changeVar(z);
		System.out.println("ct z === " + z);//30 call by value

		call.changeRef(call);
		System.out.println(call.x);//80// call by reference
	}
}
