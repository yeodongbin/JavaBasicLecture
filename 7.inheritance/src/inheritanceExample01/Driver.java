package inheritanceExample01;

public class Driver {
	//Overload
//	void driver(Bus bus) {
//		bus.run();
//		bus.price();
//	}
//	
//	void driver(Texi texi) {
//		texi.run();
//		texi.price();
//	}
	
	//������
	void driver(Vehicle vehicle) {
		vehicle.run();
		//vehicle.price();
	}
}
