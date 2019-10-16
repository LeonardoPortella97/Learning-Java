package DrinkWater;
import java.math.BigDecimal;

public class Glass extends Recipient {
	@Override
	public BigDecimal milliliter() {
	return new BigDecimal("250") ;
	}

	@Override
	public String toString() {
		return "Glass";
	}

}
