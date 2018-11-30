package interface_object;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio turn off");
	}
	

}
