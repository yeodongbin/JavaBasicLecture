package userException;

public class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public int withdraw(int money) throws BalanceInsufficientException{
		int withdrawMoney = money;
		
		if (this.balance < withdrawMoney) {
			withdrawMoney = 0;
			throw new BalanceInsufficientException("통장 잔고가 없습니다.");
			//System.out.println("통장 잔고가 없습니다.");
		} else {
			this.balance -= withdrawMoney;
		}
			
		return withdrawMoney;
	}

}
