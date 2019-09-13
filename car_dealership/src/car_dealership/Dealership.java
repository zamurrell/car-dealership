package car_dealership;

public class Dealership {

	public static void main(String[] args) {
	
		Customer cust1 = new Customer("Tom", "123 Anything Street", 10000);
		
		
		Vehicle vehicle = new Vehicle(10000, "Toyota", "Rav4");
		vehicle.setPrice(9000);
		
		Employee emp = new Employee("Jackass", 20, 5);
		
		
		cust1.purchaseCar(vehicle, emp, false);
	}

}
