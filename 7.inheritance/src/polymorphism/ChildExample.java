package polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent2 = new Parent();

		Parent parent = child;
		parent.method1();
		parent.method2();
		// parent.method3();//불가능

		if (parent instanceof Child) {     //현재 변수 이전 객체 확인
			Child child2 = (Child) parent; //강제 형변환
			child2.method1();
			child2.method2();
			child2.method3();// 사용목적
		}
	}

}
