package starCraft;

public class SCV extends Worker {

	void fix(SCV scv) {
		if (this.hashCode() != scv.hashCode()) {
			if (scv.hp > 0 && scv.hp < 96) {
				scv.hp += 5;
				System.out.println("고쳤습니다. (hp+5)");
			} else if (scv.hp >= 96 && scv.hp < 100) {
				scv.hp = 100;
				System.out.println("완전히 고쳤습니다.");
			} else {
				System.out.println("이미 튼튼합니다.");
			}
		} else {
			System.out.println("자기스스로는 고칠수 없어요");
		}
	}

	void fix(Marine marine) {
		System.out.println("마린은 고칠 수 없습니다.");
	}
}