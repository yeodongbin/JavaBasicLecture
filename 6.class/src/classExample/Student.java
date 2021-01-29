package classExample;

public class Student {
	// field
	int stu_num;
	String stu_name = "minho";

	// constructor
	Student(String _stu_name) {
		stu_name = _stu_name;

	}

	// method
	void run() {
		System.out.println(stu_name + " is running!~~~~");
	}

}
