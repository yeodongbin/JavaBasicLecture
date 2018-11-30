package class_object;

public class Asurada {
	int gas = 200;
	int maxSpeed = 200;
	int curSpeed = 0;
	String mode; // D(drive) R(back) B(booster) S(stop)
	String master;
	boolean power;

	Asurada() {
		System.out.println("������ ");
	}

	Asurada(String master) {
		this.master = master;
		System.out.println("������ " + this.master);
	}

	void transfer(String _mode) {
		if (power) {
			if ((mode == "D") && (_mode == "R")) {
				System.out.println("��� ��ȯ �ȵ� -> ���� D ����");
			} else if (mode == "R" && (_mode == "D" || _mode == "B")) {
				System.out.println("��� ��ȯ �ȵ� -> ���� R ����");
			} else {
				mode = _mode;
			}
		}
	}

	void booster() { // 5�� �ְ� �ӵ� gas -10
		int tempSpeed;
		if (power) {
			if (mode == "B" && gas >= 10) {
				tempSpeed = curSpeed;
				curSpeed = maxSpeed;
				System.out.println("Booster On");

				for (int i = 5; i > 0; i--) {
					try {
						System.out.println(i + "��");
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
			System.out.println(master + "�� �õ��Ͽ����ϴ�.");
		} else {
			System.out.println("���� ������ �����ϴ�.");
		}
	}

	void PowerOff(String key) {
		if (key.equals(master)) {
			power = false;
			System.out.println(master + "�� �õ��� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� ������ �����ϴ�.");
		}
	}
}
