package Vehicle;
import java.math.BigDecimal;

public abstract class Vehicle {
	
	private static final String TOLL_FEE = "0.75";

	public abstract int wheels ();
	
	public BigDecimal toll () {
		return new BigDecimal(TOLL_FEE).multiply(new BigDecimal(wheels()));
	}
}
