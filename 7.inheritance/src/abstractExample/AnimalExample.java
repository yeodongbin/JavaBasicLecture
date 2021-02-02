package abstractExample;

public class AnimalExample {

	public static void main(String[] args) {
		//#1
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();
		System.out.println("-------------");
		
		//#2  ���� �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------------");

		//#3 �޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal)	{
		animal.sound();
	}
}
