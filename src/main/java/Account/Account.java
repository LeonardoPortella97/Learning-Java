package Account;

import java.math.BigDecimal;

public class Account {
	public BigDecimal balance;

	
	public Account(BigDecimal zero) {
		// TODO Auto-generated constructor stub

	}
	public BigDecimal getBalance() {
		return this.balance;
	}
	public void deposit(BigDecimal value) {
		if (value != null && value.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Illegal Value");
	}
		balance = balance.add(value);
	}
	public void withdraw(BigDecimal value) {
		if (balance.compareTo(value) < 0) {
			throw new IllegalArgumentException("Balance:" + balance + "Withdraw:" + value);
		}
		balance = balance.subtract(value);

	}

}