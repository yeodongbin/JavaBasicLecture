package override_example01;

public class Drama extends TVProgram {

	private String director;
	private String actor;
	private String actress;

	public Drama(String title, String broadcast, String director, String actor, String actress) {
		super(title, broadcast);
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}

	@Override
	public String toString() {
		String tmp = "";
		tmp += "���� : " + director + "\n";
		if(actor != null)
			tmp += "����� : " + actor + "\n";
		if(actress != null)
			tmp += "����� : " + actress + "\n";
		return super.toString() + tmp;
	}

}
