package genericWildCard;

class Person1 {}
class Worker1 extends Person1 {}
class Student1 extends Person1 {}
class HighStudent1 extends Student1 {}

class Course1<T extends Person1> {}

public class WildCard {

	public static void job(Course1<Integer> course) {}
	public static void job1(Course1<?> course) {}
	public static void job2(Course1<? extends Student1> course) {}
	public static void job3(Course1<? super Worker1> course) {}
	public static void job4(Course1<? extends Person1> course) {}

	public static void main(String[] args) {
		//Course<Integer> c1 = new Course<>();
		Course1<Student1> c2 = new Course1<>();
		Course1<Person1> c3 = new Course1<>();
		
		//WildCard.job(c1);
		//WildCard.job1(c1);
		WildCard.job2(c2);
		WildCard.job3(c3);
		//WildCard.job3(c1);
	}
}