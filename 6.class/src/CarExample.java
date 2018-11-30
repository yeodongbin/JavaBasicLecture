package class_object;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car("제니시스");
		System.out.println(mycar.company);		
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		mycar.maxSpeed = 300;
		System.out.println("최고 속도 변경 : " + mycar.maxSpeed);
		
		Car sCar = new Car("BMW","5 시리즈");
		System.out.println(sCar.company);		
		System.out.println(sCar.model);
		System.out.println(sCar.color);
		System.out.println(sCar.maxSpeed);
	}
}

class Car {
	String company = "현대자동차"; 
	String model = "그랜저";
	String color = "검은색";
	String type = "세단";
	int maxSpeed = 200;
	int speed;
	
	Car(String _model) {
		model = _model;
	}
	
	Car(String _company, String _model) {
		company = _company;
		model = _model;
	}
	
	//Car() {}; // 자동생성 기본생성자
}