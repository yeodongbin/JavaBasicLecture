package laptop;

public class Laptop implements Usb,LanCard,Bluetooth {

	@Override
	public void getBluetoothManufacture() {

	}

	@Override
	public void getBluetoothVersion() {

	}

	@Override
	public void getBluetoothConnDevice() {

	}

	@Override
	public void getLanCardSpeed() {

	}

	@Override
	public void getLanCardVersion() {

	}

	@Override
	public void getLanCardConnType() {

	}

	@Override
	public void getUsbStyle() {

	}

	@Override
	public void getUsbVersion() {

	}

	@Override
	public void getUsbCapacity() {

	}
}

interface Usb {
	// static final ÀÌ ¼û°ÜÁü
	String style = "Samsung USB";
	double version = 2.0;
	String capacity = "8GB";

	public abstract void getUsbStyle();
	public abstract void getUsbVersion();
	public abstract void getUsbCapacity();
}

interface LanCard {
	String speed = "100MBps";
	double version = 1.0;
	String connType = "Small";

	public abstract void getLanCardSpeed();  
	public abstract void getLanCardVersion();
	public abstract void getLanCardConnType();
}

interface Bluetooth {
	String manufacture = "Samsung";
	double version = 3.0;
	String connDevice = "Smartphone";

	public abstract void getBluetoothManufacture();
	public abstract void getBluetoothVersion();
	public abstract void getBluetoothConnDevice();
}
