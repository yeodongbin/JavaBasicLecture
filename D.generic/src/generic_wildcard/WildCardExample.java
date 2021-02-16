package generic_wildcard;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " 
							+ Arrays.toString(course.getStudents()));}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " 
							+ Arrays.toString(course.getStudents()));}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������:" 
							+ Arrays.toString(course.getStudents()));}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));

		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));

		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));

		Course<HighStudent> highstudentCourse = new Course<HighStudent>("����л�����", 5);
		highstudentCourse.add(new HighStudent("����л�"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highstudentCourse);
		System.out.println();

		// registerCourseStudent(personCourse); (x)
		// registerCourseStudent(WorkerCourse); (x)
		registerCourseStudent(studentCourse);
		registerCourseStudent(highstudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse); (x)
		// registerCourseWorker(highStudentCourse); (x)
	}
}