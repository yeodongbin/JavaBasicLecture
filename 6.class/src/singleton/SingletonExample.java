package singleton;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton s1 = new Singleton();
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.className);
	}

}
