package interfaceExample;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; //static final 생략
	
	public abstract void turnOn();
	public void turnOff(); //abstract 생략
	
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음");
		} else {
			System.out.println("유음");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지 교환");
	}
}