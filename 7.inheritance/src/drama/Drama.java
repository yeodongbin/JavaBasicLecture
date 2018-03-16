package drama;

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
		tmp += "감독 : " + director + "\n";
		if(actor != null)
			tmp += "남배우 : " + actor + "\n";
		if(actress != null)
			tmp += "여배우 : " + actress + "\n";
		return super.toString() + tmp;
	}

}
