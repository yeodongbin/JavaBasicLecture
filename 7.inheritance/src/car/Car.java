package inheritance.car;

public class Car {

//	Tire fl = new Tire("Front Left",10);
//	Tire fr = new Tire("Front Right",20);
//	Tire bl = new Tire("Back Left",30);
//	Tire br = new Tire("Back Right",40);

//	Tire fl = new HankookTire("Front Left");
//	Tire fr = new HankookTire("Front Right");
//	Tire bl = new KumhoTire("Back Left");
//	Tire br = new KumhoTire("Back Right");

	Tire[] tire = { new HankookTire("Front Left"), 
			        new HankookTire("Front Right"), 
			        new KumhoTire("Back Left"),
			        new KumhoTire("Back Right") 
			        };

	void run() {
		System.out.println("자동차가 달립니다.");
		for (int i=0 ; i<4 ; i++) {
			tire[i].roll();
			if (tire[i].accumlatedRoatation == tire[i].maxRotation) {
				this.stop();
				break;
			}
		}
//		fl.roll();
//		fr.roll();
//		bl.roll();
//		br.roll();
	}

	void stop() {
		System.out.println("자동차를 멈춥니다.");
	}
}
