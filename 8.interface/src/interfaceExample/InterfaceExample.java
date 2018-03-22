package interfaceExample;

interface aExample {
	public void sayHello();
}

interface bExample {
	public void sayBye();
}

public class InterfaceExample implements aExample, bExample {

	public void sayHello() {
		System.out.println("�ȳ�!");
	}

	public void sayBye() {
		System.out.println("�߰�!");
	}

	public static void main(String[] args) {
		InterfaceExample interfaceExample = new InterfaceExample();
		interfaceExample.sayHello();
		interfaceExample.sayBye();
	} // main

}
