package problem;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class Pro10 {
	public static void main(String[] args) {
		TreeSet<Student2> treeset = new TreeSet<>();
		treeset.add(new Student2("blue", 96));
		treeset.add(new Student2("hong", 86));
		treeset.add(new Student2("white", 92));

		Student2 stu = treeset.last();
		System.out.println(stu.score);
		System.out.println(stu.id);

	}
}

class Student2 implements Comparable<Student2> {

	String id;
	int score;

	Student2(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Student2 o) {
		if (this.score < o.score) { return -1;}
		else if (this.score==o.score) {return 0;}
		else {return 1;}
	}
}
