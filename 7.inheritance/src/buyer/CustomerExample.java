package inheritance.buyer;

public class CustomerExample {

	public static void main(String[] args) {
		Customer customer = new Customer(10000);
		
		customer.buy(new Banana());
		customer.buy(new Banana()); // Ŀ���͸� buy�޼ҵ� ��ü�� ���δ�Ʈ���� ����������
		customer.buy(new Egg());    // ���δ�Ʈ���� ����,�ٳ��� ���� new������ ȣ���� �ؼ� �����;���
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
