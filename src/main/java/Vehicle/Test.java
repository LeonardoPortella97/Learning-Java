package Vehicle;
import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		
	Vehicle [] vehicles = {
			new Motorcycle(), new Motorcycle(),
			new Car(),new Car(),new Car(),new Car(),
			new Truck(),new Truck(),new Truck(),new Truck(),new Truck(),new Truck()
	};
	
	BigDecimal total = BigDecimal.ZERO;
	
	for (Vehicle vehicle : vehicles) {
	total=total.add(vehicle.toll());

	}
	System.out.println(total);
	}

}
