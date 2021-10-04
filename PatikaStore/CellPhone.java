package store;

public class CellPhone extends Product{
	
	private String color;
	private int camera, ram, storage;
	private double screen, battery;
	
	public CellPhone(Brand brand, String pName, int id, int stock, double price, double discount, String color,
			int camera, int ram, int storage, double screen, double battery)
	{
		super(brand, pName, id, stock, price, discount);
		this.color = color;
		this.camera = camera;
		this.ram = ram;
		this.storage = storage;
		this.screen = screen;
		this.battery = battery;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getScreen() {
		return screen;
	}

	public void setScreen(double screen) {
		this.screen = screen;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}
	
}
