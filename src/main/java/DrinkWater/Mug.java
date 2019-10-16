package DrinkWater;
import java.math.BigDecimal;

public class Mug extends Recipient {
	@Override
	public BigDecimal milliliter() {
	return new BigDecimal("150") ;
	}

	@Override
	public String toString() {
		return "Mug";
	}

}
