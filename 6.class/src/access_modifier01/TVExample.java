package access_modifier01;

public class TVExample {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.PowerOn();
		tv.check();
		tv.changeCh(11);
		tv.check();
		tv.setMute();
		tv.check();
	}

}
