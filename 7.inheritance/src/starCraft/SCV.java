package starCraft;

public class SCV extends Worker {

	void fix(SCV scv) {
		if (this.hashCode() != scv.hashCode()) {
			if (scv.hp > 0 && scv.hp < 96) {
				scv.hp += 5;
				System.out.println("���ƽ��ϴ�. (hp+5)");
			} else if (scv.hp >= 96 && scv.hp < 100) {
				scv.hp = 100;
				System.out.println("������ ���ƽ��ϴ�.");
			} else {
				System.out.println("�̹� ưư�մϴ�.");
			}
		} else {
			System.out.println("�ڱ⽺���δ� ��ĥ�� �����");
		}
	}

	void fix(Marine marine) {
		System.out.println("������ ��ĥ �� �����ϴ�.");
	}
}