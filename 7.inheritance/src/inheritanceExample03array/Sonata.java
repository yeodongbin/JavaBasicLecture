package inheritanceExample03array;

public class Sonata extends Car {

	private String series;
	private String master;
	
	Sonata(String color, int number, String series, String master) {
		super(color, number);
		this.series = series;
		this.master = master;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tSeries : "+series + "\tMaster : " + master;
	}

}
