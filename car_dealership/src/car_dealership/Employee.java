package car_dealership;

public class Employee {

	String name;
	int age;
	int yearsWorked;
	
	
	
	public Employee(String name, int age, int yearsWorked) {
		super();
		this.name = name;
		this.age = age;
		this.yearsWorked = yearsWorked;
	}

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (finance == true) {;
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
 			// customer pays in cash
 			processTransaction(vehicle);
 		} 
 		else {
 			System.out.println("Customer will need more money to purchase vehicle: " + vehicle.getMake() + " " +vehicle.getModel());
 		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer");
		System.out.println("Customer has been approved to purchase the vehicle with a loan of "+ loanAmount);
	}
	
	public void processTransaction( Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " + vehicle.getMake() + " " + vehicle.getModel() + " for the price " + vehicle.getPrice());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearsWorked() {
		return yearsWorked;
	}
	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
}
