package classExample;

public class Student {
	String name = "minho";
	
	Student(String _name){ //1순위
		name = _name;
	}
	
	void run() {
		System.out.println(name + "는 달린다.");
	}
}
