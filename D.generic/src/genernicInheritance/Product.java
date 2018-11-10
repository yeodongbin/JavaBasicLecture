package genernicInheritance;

public class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		System.out.println("Product.getKind");
		return this.kind;
	}

	public M getModel() {
		System.out.println("Product.getModel");
		return this.model;
	}

	public void setKind(T kind) {
		System.out.println("Product.setKind");
		this.kind = kind;
	}

	public void setModel(M model) {
		System.out.println("Product.setModel");
		this.model = model;
	}
}

class Tv {
}