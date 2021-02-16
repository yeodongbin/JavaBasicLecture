package genericWildCard;

public class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}
	
//	public String[] getStudents() {
//		String[] student = new String[students.length];
//		
//		for (int i=0;i<students.length; i++) {
//			student[i] = students[i].toString();
//		}
//		
//		return student;
//	}

	public T[] getStudents() {		
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

class Person {
	String type;

	Person(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
}

class Worker extends Person {
	Worker(String type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return type;
	}
}

class Student extends Person {
	Student(String type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return type;
	}
}

class HighStudent extends Student {
	HighStudent(String type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return type;
	}

}