package interfaceExample;

public interface RemoteControl {
	// 상수
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // static final 자동인식

	// 추상 매서드(Abstract method)
	public abstract void remoteTurnOn();
	public void remoteTurnOff();

	// Remote Control의 고유 기능
	public static void changeBattery() {
		System.out.println("change Battery~");
	}

	// default method => code update
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("mute On!!!");
		} else {
			System.out.println("mute Off!!!");
		}
	}
}