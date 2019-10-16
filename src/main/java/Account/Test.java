package Account;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		Account ac1 = new Account(BigDecimal.ZERO);
		ac1.deposit(new BigDecimal("500"));
		
		ac1.withdraw(new BigDecimal("100"));
		;
		ac1.withdraw(new BigDecimal("4.30"));
	
		ac1.withdraw(new BigDecimal("250"));
		
		System.out.println(ac1.getBalance());
		
		ac1.withdraw(new BigDecimal("146"));
		
		

	}

}
