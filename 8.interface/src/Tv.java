package interface_object;

public abstract class Tv implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV turn on");
	}
}
