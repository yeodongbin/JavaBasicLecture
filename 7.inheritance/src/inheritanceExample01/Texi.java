package inheritanceExample01;

public class Texi extends Vehicle{
Driver driver = null;
	
	Texi(Driver driver) {
		super("Texi");
		this.driver = driver; 
	}
	
	void price() {
		System.out.println("Texi Price()");
	}
	
	@Override
	void run() {
		super.run();
		System.out.println("Driver Name : " + driver.name);
	}
}
