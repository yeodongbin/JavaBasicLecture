package interface_object;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl.changeBattery();
		
		LGTV lgtv = new LGTV();
		lgtv.turnOn();
		lgtv.turnOff();
		
//		Tv tv = new Tv(); //abstract class ±¸Çö X
		
//		tv.turnOn();
//		tv.turnOff();
//		tv.setMute(true);
		
		Audio audio = new Audio();
//		audio.turnOn();
//		audio.turnOff();
//		audio.setMute(true);
//		
		RemoteControl rc =null;
		rc = audio;
		rc.turnOn();
		rc.turnOff();
		
		rc = lgtv;
		rc.turnOn();
		rc.turnOff();
	}

}
