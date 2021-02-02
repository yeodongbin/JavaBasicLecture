package inheritanceExample01;

public class Vehicle {
String type;
	
	Vehicle(String type) {
		this.type = type;
	}
	
	void run() {
		System.out.println(type + " is running~");
	}
}
