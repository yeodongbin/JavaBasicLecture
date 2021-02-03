package interfaceExample;

public class Audio implements RemoteControl {

	@Override
	public void remoteTurnOn() {
		System.out.println("remote Turn On!!");
	}

	@Override
	public void remoteTurnOff() {
		System.out.println("remote Turn Off!!");

	}
}
