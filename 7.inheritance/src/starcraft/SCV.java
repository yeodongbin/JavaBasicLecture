package starcraft;

public class SCV extends Worker {
	SCV() {
		this.type = "SCV";
	}
	
	
	void fix(Vehicle vehicle) {
		vehicle.hp++;
	}
	
	void fix(SCV scv) {
		if (this.hashCode() != scv.hashCode()) {
			scv.hp++;	
		}
		
	}
}
