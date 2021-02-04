package genernic_inheritance;


public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		System.out.println("ChildProduct.getCompany()");
		return this.company;
	}

	public void setCompany(C company) {
		System.out.println("ChildProduct.setCompany()");
		this.company = company;
	}
}
