package class_object.example;

public class Pro19 {
	
	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(300000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	}
}

class Account {
	static final int MIN_BALANCE = 0; //»ó¼ö
	static final int MAX_BALANCE = 1000000;

	private int balance = 0;

	int getBalance() {
		return this.balance;
	}

	void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
}
