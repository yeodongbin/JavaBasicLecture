package basicApiClass;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		try {
			Class car2 = Class.forName("basicApiClass.Car");
			Object obj = car2.newInstance();
			
			System.out.println(car2.getName());
			System.out.println(car2.getPackage().getName());
			
			Class car1 = car.getClass();
			System.out.println(car1.getName());
			System.out.println(car1.getPackage().getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Car {
	
	Car() {
		System.out.println("Car() »ý¼ºÀÚ");
	}
	
}
