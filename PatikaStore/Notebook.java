package store;

public class Notebook extends Product{

	private int ram, storage;
	private double screen;
	
	public Notebook(Brand brand, String pName, int id, int stock, double price, double discount, int ram, int storage,
			double screen) 
	{
		super(brand, pName, id, stock, price, discount);
		this.ram = ram;
		this.storage = storage;
		this.screen = screen;
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
	
}
