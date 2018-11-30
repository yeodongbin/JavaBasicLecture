package inheritance.buyer;

public class CustomerExample {

	public static void main(String[] args) {
		Customer customer = new Customer(10000);
		
		customer.buy(new Banana());
		customer.buy(new Banana()); // 커스터머 buy메소드 객체를 프로덕트에서 가져왓으니
		customer.buy(new Egg());    // 프로덕트에서 에그,바나나 등을 new생성자 호출을 해서 가져와야함
		customer.buy(new Egg());
		customer.buy(new Egg());
		customer.buy(new Egg());
		customer.buy(new Egg());
		customer.buy(new Egg());
		customer.buy(new Egg());
		customer.buy(new Egg());
		customer.buy(new Egg());
		
		customer.total();
		
		System.out.println(customer.getMoney());
		customer.setMoney(10000);
		System.out.println(customer.getMoney());
	}

}
