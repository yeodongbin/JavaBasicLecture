package interfaceExample;


class Ai {
	void methodA() {
		Indirect_interface i = InstanceManager.getInstance();
		i.methodB();
	}
}

class Bi implements Indirect_interface{
	 public void methodB() {
		System.out.println("play in B class");
	}
}

class InstanceManager{
	public static Indirect_interface getInstance() {
		return new Bi();
	}
}

public class Indirect {

	public static void main(String[] args) {
		Ai a = new Ai();
		a.methodA();
	}
}
