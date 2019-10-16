package DrinkWater;
import java.math.BigDecimal;

public class Squeeze extends Recipient {
	@Override
	public BigDecimal milliliter() {
	return new BigDecimal("500") ;
	}

	@Override
	public String toString() {
		return "Squeeze";
	}

}
