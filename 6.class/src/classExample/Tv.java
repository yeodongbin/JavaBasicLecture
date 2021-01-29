//class : TV
//�� �� : ������    String maker
//        ȭ��ũ��  int screenSize
//        ä��      int chanel
//        ����      int volume
//        ����      boolean power
//
//�� �� : �ѱ�      void powerOn()
//        ����      void powerOff() >>>>> power(boolean power)
//        ��ä����  int chanelUp()
//        ��ä�ξƷ�int chanelDown()
//        ä�κ���  int changeChanel(int chanel)
//        ������    void volumeUp()
//        �����ٿ�  void volumeDown()
//        ���Ұ�    void mute()

package classExample;

public class Tv {
	String maker;
	int screenSize;
	int channel = 50;
	int curVolume = 10;
	int tempVolume = 0;
	int maxVolume = 50;
	int minVolume = 0;
	boolean power;
	boolean mute = false; // ���Ұ� �ƴ� ����
	String OnOff;

	void powerOn() {
		power = true;
		System.out.println("TV ON");
	}

	void powerOff() {
		power = false;
		System.out.println("TV OFF");
	}

	void volumeUp() {
		if (power) {
			if (curVolume < 50 && curVolume >= 0) {
				curVolume += 1;
				System.out.println("������!!");
				System.out.println("���纼��:" + curVolume);
			} else if (curVolume == 0) {//
				System.out.println("�ּҺ����Դϴ�.");
				System.out.println("���纼��:" + curVolume);

			} else if (curVolume == 50) {
				System.out.println("�ִ뺼���Դϴ�.");
				System.out.println("���纼��:" + curVolume);

			}
		}
	}

	void volumeDown() {
		if (power) {
			if (curVolume < 50 && curVolume >= 0) {
				curVolume -= 1;
				System.out.println("�����ٿ�!!");
				System.out.println("���纼��:" + curVolume);
			} else if (curVolume == 0) {
				System.out.println("�ּҺ����Դϴ�.");
				System.out.println("���纼��:" + curVolume);

			} else if (curVolume == 50) {//
				System.out.println("�ִ뺼���Դϴ�.");
				System.out.println("���纼��:" + curVolume);

			}
		}
	}

	void mute() {
		if (power) {
			if (mute == true) {// ���Ұ�
				curVolume = tempVolume;
				mute = false;
				System.out.println("���Ұ� ����");
				System.out.println("��������:" + curVolume);
			} else if (mute == false) { // ���Ұ� �ƴ� ����
				tempVolume = curVolume;
				mute = true;
				System.out.println("���Ұ�");
				System.out.println("��������:" + curVolume);
			}
		}
	}

	int chanelUp() {
		int result = 0;
		if (power) {
			result = (channel % 100) + 1;// 1~100
			System.out.println("����ä��:" + result);
			return result;
		}
		return result;
	}

	int chanelDown() {
		int result = 0;
		if (power) {
			if (channel == 1) {
				result = 100;
			} else {
				result = (channel + 99) % 100;
			}
			System.out.println("����ä��:" + result);
			return result;
		}
		return result;
	}

	int changeChanel(int chanel) {
		if (power) {
			if (chanel <= 100 && chanel > 0) {
				int result = chanel;
				System.out.println("����ä��:" + result);
				return result;
			}
		}
		return chanel;
	}
}