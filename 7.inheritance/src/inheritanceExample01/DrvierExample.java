package inheritanceExample01;

public class DrvierExample {

	public static void main(String[] args) {
		Driver driver = new Driver("Yeo");
		Bus bus = new Bus(driver);
		bus.run();
		
		Texi texi = new Texi(new Driver("Lee"));
		texi.run();
	}

}
