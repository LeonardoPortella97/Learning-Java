package DrinkWater;

import java.math.BigDecimal;

public class Person {
	
	
	private static final String IDEAL_AMOUNT_OF_WATER = "35";
	private String name;
	private BigDecimal weight;
	private BigDecimal drunk;
	

	public Person(String name, BigDecimal weight) {
		this.name = name;
		this.weight=weight;
		drunk= new BigDecimal("0");
		
	
	}

	public BigDecimal watercalculator () {
	return new BigDecimal(IDEAL_AMOUNT_OF_WATER).multiply((weight));
	
	}
	
	public void drink (BigDecimal recipient) {
		drunk = drunk.add(recipient);
		
	}	
		
	public BigDecimal Drunk() {
		return drunk;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	public boolean isSatisfied() {
		 return watercalculator().compareTo(Drunk()) <= 0;
	}
	
	

}
