package interfaceExample;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; //static final ����
	
	public abstract void turnOn();
	public void turnOff(); //abstract ����
	
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
	
	public static void changeBattery() {
		System.out.println("������ ��ȯ");
	}
}