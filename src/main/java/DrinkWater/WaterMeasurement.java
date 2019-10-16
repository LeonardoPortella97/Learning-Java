package DrinkWater;

import java.math.BigDecimal;

class WaterMeasurement {
	public static void main(String[] args) {
        Person[] people = {
                new Person("Joe", new BigDecimal(80)),
                new Person("Mary", new BigDecimal(45)),
                new Person("Ed", new BigDecimal(100))
        };
        Recipient[] recipients = {
                new Mug(),
                new Glass(),
                new Squeeze(),
                new Squeeze(),
                new Glass(),
                new Squeeze(),
                new Squeeze(),
                new Mug(),
                new Glass(),
                new Glass(),
                new Squeeze(),
                new Mug()
        };
        for (Person person : people) {
        	System.out.println(person + " has to drink "+ person.watercalculator() + " to achieve the goal ");
           for (Recipient recipient : recipients) {
				person.drink(recipient.milliliter());
	        	   System.out.println(recipient);
        	   if (person.isSatisfied()) {
        		   System.out.println(person + " drank " + person.Drunk()+ " milliliters");
        		   break;
        	   }
				
			}
        }
    }
}