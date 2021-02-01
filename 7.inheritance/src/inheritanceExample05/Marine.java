/*
class : Marine
field
  - ü�� : hp (100)
  - ��� : mode (0 >> ���ݷ� 10, 1 >> ���ݷ� 25(��ü�� -25))

method
  - ���� : public [   RT   ] attack([  args  ]) {   }
  - ��庯�� : void setMode(int mode)
*/
package inheritanceExample05;

public class Marine {
	int hp;
	int mode;
	int power;
	boolean modeOk;

	public Marine() {
		hp = 100;
		power = 10;
		modeOk = true;
		//mode = 0;
	}

	public void attack(Marine enemy) {
		modeOk = true;
		enemy.hp -= power;
	}

	public void setMode(int mode) {
		if(hp > 30) {
			this.mode = mode;
			if(this.mode == 1) {
				hp -= 25;
				power = 25;
			} else {
				power = 10;
			}
		} else {
			modeOk = false;
		}
	}

	@Override
	public String toString() {
		if(modeOk)
			return "ü�� : " + (hp <= 0 ? "die" : hp + ""); 
		else
			return "30���ϴ� ���� �Ұ���";
	}
}













