package abstractExample;

public abstract class Animal {
	public String kind;

	public Animal() {
		System.out.println("Animal()");
	}

	public void breathe() {
		System.out.println("Breath");
	}

	public abstract void sound();
}
