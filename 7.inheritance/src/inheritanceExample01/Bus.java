package inheritanceExample01;

public class Bus extends Vehicle {
	@Override
	void run() {
		System.out.println("Bus �� �޸���.");
	}
	
	void price() {
		System.out.println("Bus�� ���� ����");
	}
}
