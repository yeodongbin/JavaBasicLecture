package overload_car;

public class Car {
	// field 필드
	static final String company = "BMW";
	static final double PI = 3.14521;
	String model;
	int cc;
	int maxSpeed;
	int speed;

	// Constructor 생성자 오버로딩
	Car(int cc) {
		this(cc, "람보르기니");
		/*
		 * String model = "기블리"; System.out.println(model);
		 */
	}

	Car(String model) {
		this(5000, model);
	}

	Car(int cc, String model) {
		this.cc = cc;
		this.model = model;
		System.out.println("Car(int cc, String model) 호출");
	}

	Car(int cc, String model, int maxSpeed) {
		this(cc, model);
		/*
		 * this.cc = cc; this.model = model;
		 */
		this.maxSpeed = maxSpeed;
	}

	// Method 매서드
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다." + this.speed + "km/h");
		}
	}
}
