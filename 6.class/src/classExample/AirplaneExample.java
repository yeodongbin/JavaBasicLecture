package classExample;

public class AirplaneExample {

	public static void main(String[] args) {

		new F35();
		F35 f35 = new F35();
		f35.fly();
		
	}
}

class F35 {
//	������ : 1
//	���� : 51.4 ft (15.67 m)
//	�� : 35 ft (10.67m)
//	���� : 14.2 ft (4.57 m)
//	�������� : 460 ft(42.74 m^2)
//	�� �߷� : 29,300 lb (13,170kg)
//	����� �߷� : 49,540 lb (22,470 kg)
//	�ִ��̷��߷� : 70,000 lb (31,800 kg)
//	���̴� : AN/APG-81
	int f = 1;
	double length = 15.67;
	double size = 10.67;
	
	F35() {
		System.out.println("F35 �ϳ� ����ϴ�.");
	}
	
	
	void fly() {
		System.out.println("�ϴ��� ����.");
	}
}

