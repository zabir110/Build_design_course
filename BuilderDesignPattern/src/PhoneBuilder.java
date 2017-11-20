
public class PhoneBuilder {
	private String name;
	private String model;
	private int battery;
	private double size;
	private double price;
	
	
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setSize(double size) {
		this.size = size;
		return this;
	}
	public PhoneBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(name,model,battery,size,price);
	}
}
