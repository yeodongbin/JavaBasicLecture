package classExample;

public class AirplaneExample {

	public static void main(String[] args) {

		new F35();
		F35 f35 = new F35();
		f35.fly();
		
	}
}

class F35 {
//	조종사 : 1
//	길이 : 51.4 ft (15.67 m)
//	폭 : 35 ft (10.67m)
//	높이 : 14.2 ft (4.57 m)
//	날개면적 : 460 ft(42.74 m^2)
//	공 중량 : 29,300 lb (13,170kg)
//	무장시 중량 : 49,540 lb (22,470 kg)
//	최대이륙중량 : 70,000 lb (31,800 kg)
//	레이더 : AN/APG-81
	int f = 1;
	double length = 15.67;
	double size = 10.67;
	
	F35() {
		System.out.println("F35 하나 삳습니다.");
	}
	
	
	void fly() {
		System.out.println("하늘을 난다.");
	}
}

