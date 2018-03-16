package inheritance_pro5;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		//this.name = name;
		this.studentNo = studentNo;
	}
	
}
