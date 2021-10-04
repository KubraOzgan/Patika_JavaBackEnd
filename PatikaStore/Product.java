package store;

public class Product {
	
	private Brand brand;
	private String pName;
	private int id, stock;
	private double price, discount;
	

	public Product(Brand brand, String pName, int id, int stock, double price, double discount) 
	{
		this.brand = brand;
		this.pName = pName;
		this.id = id;
		this.stock = stock;
		this.price = price;
		this.discount = discount;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}	

}
