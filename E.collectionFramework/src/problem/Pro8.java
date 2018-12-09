package problem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pro8 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();

		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�")); // �й��� �����Ƿ� ������� ����

		Iterator<Student> iterator = set.iterator();

		while (iterator.hasNext()) {
			Student st = iterator.next();
			System.out.println(st.Stu_no + ":" + st.Stu_name);
		}
	}
}

class Student {
	public int Stu_no;
	public String Stu_name;

	Student(int Stu_no, String Stu_name) {
		this.Stu_no = Stu_no;
		this.Stu_name = Stu_name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return s.Stu_no == Stu_no;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Stu_no;
	}
}
