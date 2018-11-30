package starCraft;

public class Worker extends Unit {
	int mineral = 0;

	Worker() {
		super("Worker");
		super.hp = 100;
		super.mp = 0;
		super.power = 5;
		super.speed = 3;
	}

	void mind(int x, int y) {
		if (x == 10 && y == 10) {
			mineral += 10;
			System.out.println("�̳׶� ĺ��!!");
			System.out.println("���� �̳׶�:" + mineral);
		}
	}

	void attack(SCV scv) {
		if (scv.hp > 0) {
			scv.hp -= super.power;
		} else {
			System.out.println("��밡 �����߽��ϴ�.");
		}
	}

	void attack(Marine marine) {
		if (marine.hp > 0) {
			marine.hp -= super.power;
		} else {
			System.out.println("��밡 �����߽��ϴ�.");
		}
	}
}
