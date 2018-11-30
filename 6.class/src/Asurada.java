package class_object;

public class Asurada {
	int gas = 200;
	int maxSpeed = 200;
	int curSpeed = 0;
	String mode; // D(drive) R(back) B(booster) S(stop)
	String master;
	boolean power;

	Asurada() {
		System.out.println("고니찌와 ");
	}

	Asurada(String master) {
		this.master = master;
		System.out.println("고니찌와 " + this.master);
	}

	void transfer(String _mode) {
		if (power) {
			if ((mode == "D") && (_mode == "R")) {
				System.out.println("모드 변환 안됨 -> 현재 D 상태");
			} else if (mode == "R" && (_mode == "D" || _mode == "B")) {
				System.out.println("모드 변환 안됨 -> 현재 R 상태");
			} else {
				mode = _mode;
			}
		}
	}

	void booster() { // 5초 최고 속도 gas -10
		int tempSpeed;
		if (power) {
			if (mode == "B" && gas >= 10) {
				tempSpeed = curSpeed;
				curSpeed = maxSpeed;
				System.out.println("Booster On");

				for (int i = 5; i > 0; i--) {
					try {
						System.out.println(i + "초");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println("Booster Off");
				curSpeed = tempSpeed;
			}
		}
	}

	void run() { // run() -> gas -5
		if (power) {
			if (mode == "D" && gas > 5) {
				curSpeed += 10;
				gas -= 5;
			}
		}
	}

	void stop() {
		if (power && mode == "S") {
			if (curSpeed <= 20) {
				curSpeed = 0;
			} else {
				curSpeed = curSpeed - 20;
			}
		}
	}

	void PowerOn(String key) {
		if (key.equals(master)) {
			power = true;
			System.out.println(master + "님 시동하였습니다.");
		} else {
			System.out.println("접근 권한이 없습니다.");
		}
	}

	void PowerOff(String key) {
		if (key.equals(master)) {
			power = false;
			System.out.println(master + "님 시동을 종료하였습니다.");
		} else {
			System.out.println("접근 권한이 없습니다.");
		}
	}
}
