package problem;

public class Pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent {
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
}
