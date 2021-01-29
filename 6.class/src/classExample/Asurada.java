package classExample;

public class Asurada {
	int gas = 200;
	int curSpeed = 0;
	int maxSpeed = 300;
	String master;
	String mode; // D driver, R back, B boostar
	boolean power;

	Asurada(String _master) {
		master = _master;
		System.out.println("고니찌와 ~ " + master + "상");
	}

	void powerOn() {
		power = true;
		System.out.println("시동이 켜졌습니다.");
	}

	void powerOff() {
		if (power == true && curSpeed == 0) {
			power = false;
			System.out.println("시동이 꺼졌습니다.");
		} else {
			System.out.println("시동을 끌수 없어요!! 확인바람");
		}

	}

	void transfer(String _mode) {
		switch (_mode) {
		case "D":
			if (curSpeed >= 0) {
				mode = _mode;
				break;
			}
		case "R":
			if (curSpeed == 0) {
				mode = _mode;
				break;
			}
		case "N":
			mode = _mode;
			break;
		case "B":
			if (curSpeed >= 0) {
				mode = _mode;
				break;
			}
		case "P":
			if (curSpeed == 0) {
				mode = _mode;
				break;
			}
		default:
			System.out.println("변속기를 제어할 수 없습니다.");
		}
		System.out.println("Mode : " + mode);

	}

	void run() {
		if (power) {
			if (mode == "D" && gas >= 10) {
				if (curSpeed <= (maxSpeed - 30)) {
					curSpeed += 30;
					gas -= 10;
				} else {
					curSpeed = maxSpeed;
					gas -= 10;
				}
			} else if (mode == "B" && gas >= 50) {
				booster(curSpeed);
			} else if (mode == "R" && gas >= 10) {
				curSpeed = -10;
				gas -= 10;
			} else {
				System.out.println("달릴 수 없습니다.!!");
			}
		}
	}

	void booster(int _curSpeed) {
		curSpeed = maxSpeed;
		gas -= 50;

		int sec = 5;
		while (sec > 0) {
			System.out.println("BOOSTER ON! : " + curSpeed + " - "+ sec + " Sec");
			sec--;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			;
		}
		curSpeed = _curSpeed;
	}

	void check() {
		System.out.println("Current Speed : " + curSpeed);
		System.out.println("Gas Level : " + gas);
		System.out.println("Power check : " + power);
		System.out.println();
	}

}
