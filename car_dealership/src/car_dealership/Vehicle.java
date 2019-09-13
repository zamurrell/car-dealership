package car_dealership;

public class Vehicle {
	
	
	private double price;
	private String Make;
	private String Model;
	
	
	
	public Vehicle(double price, String make, String model) {
		super();
		this.price = price;
		Make = make;
		Model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	
}
