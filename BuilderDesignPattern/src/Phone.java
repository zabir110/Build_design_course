
public class Phone {
	private String name;
	private String model;
	private int battery;
	private double size;
	private double price;
	
	public Phone(String name, String model, int battery, double size, double price) {
		super();
		this.name = name;
		this.model = model;
		this.battery = battery;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", model=" + model + ", battery=" + battery + ", size=" + size + ", price="
				+ price + "]";
	}
	
}
