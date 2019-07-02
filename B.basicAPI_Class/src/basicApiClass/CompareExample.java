package basicApiClass;

import java.util.*;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(10);
		Student s2 = new Student(10);
		int result = 
				Objects.compare(s1, s2, new StudentCom());
		
		System.out.println(result);
	}
}

class Student {
	int id;

	Student(int id) {
		this.id = id;
	}
}

class StudentCom implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.id > s2.id) {
			return -1;
		} else if (s1.id < s2.id) {
			return 1;
		} else {
			return 0;
		}
	}
}
