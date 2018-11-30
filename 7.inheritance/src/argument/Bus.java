package inheritance.argument;

public class Bus extends Vehicle {
	@Override
	void run() {
		System.out.println("Bus 이 달린다.");
	}
	
	void price() {
		System.out.println("Bus에 돈을 지급");
	}
}
