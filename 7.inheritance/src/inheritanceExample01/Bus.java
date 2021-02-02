package inheritanceExample01;

public class Bus extends Vehicle {
Driver driver = null;
	
	Bus(Driver driver) {
		super("Bus");
		this.driver = driver; 
	}
	
	void price() {
		System.out.println("Bus Price()");
	}
	
	@Override
	void run() {
		super.run();
		System.out.println("Driver Name : " + driver.name);
	}
}
