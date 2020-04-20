package classCastException;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
		
		Animal animal = new Animal();
		changeDog(animal);
		
		animal = new Dog();
		changeDog(animal);
	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("港港");
		} else {
			System.out.println("具克");
		}
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
