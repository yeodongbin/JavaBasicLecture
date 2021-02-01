/*
class : Marine
field
  - 체력 : hp (100)
  - 모드 : mode (0 >> 공격력 10, 1 >> 공격력 25(내체력 -25))

method
  - 공격 : public [   RT   ] attack([  args  ]) {   }
  - 모드변경 : void setMode(int mode)
*/
package inheritanceExample;

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
			return "체력 : " + (hp <= 0 ? "die" : hp + ""); 
		else
			return "30이하는 변경 불가능";
	}
}













