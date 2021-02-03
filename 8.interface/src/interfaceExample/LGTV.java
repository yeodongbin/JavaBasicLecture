package interfaceExample;

public class LGTV extends Audio implements Tv, Specker {
	public void turnOn() {
		System.out.println("Tv Turn On!");
	}
	
	public void turnOff() {
		System.out.println("Tv Turn Off");
	}
	
	public void remoteTurnOn() {
		System.out.println("remote Turn On!!");
	}
	@Override
	public void remoteTurnOff() {
		System.out.println("remote Turn Off!!");
	}

	@Override
	public void mute() {
		System.out.println("mute()");		
	}
	
	public static void main(String[] args) {
		LGTV lgtv = new LGTV();
		lgtv.turnOn();
		lgtv.turnOff();
		lgtv.remoteTurnOn();
		lgtv.remoteTurnOff();
	}

}
