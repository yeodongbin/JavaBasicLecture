package driver;

public class Texi extends Vehicle{
	@Override
	void run() {
		System.out.println("Texi 이 달린다.");
	}
	
	void price() {
		System.out.println("Texi에 돈을 지급");
	}
}
